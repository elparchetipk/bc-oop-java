#!/bin/bash

# Manual installation script for auto-commit cron job
# Run this script to install the cron job

SCRIPT_PATH="/home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.sh"
LOG_PATH="/home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.log"

echo "======================================"
echo "Auto-commit Cron Job Installer"
echo "======================================"
echo ""

# Check if script exists
if [ ! -f "$SCRIPT_PATH" ]; then
    echo "❌ Error: auto-commit.sh not found at $SCRIPT_PATH"
    exit 1
fi

# Check if script is executable
if [ ! -x "$SCRIPT_PATH" ]; then
    echo "⚠️  Script is not executable. Making it executable..."
    chmod +x "$SCRIPT_PATH"
fi

# Create cron entry
CRON_ENTRY="*/5 * * * * $SCRIPT_PATH >> $LOG_PATH 2>&1"

echo "📝 Cron entry to be added:"
echo "   $CRON_ENTRY"
echo ""

# Check if cron entry already exists
if crontab -l 2>/dev/null | grep -q "auto-commit.sh"; then
    echo "⚠️  Auto-commit cron job already exists!"
    echo ""
    read -p "Do you want to replace it? (y/n): " -n 1 -r
    echo ""
    if [[ ! $REPLY =~ ^[Yy]$ ]]; then
        echo "Installation cancelled."
        exit 0
    fi
    # Remove existing entry
    crontab -l 2>/dev/null | grep -v "auto-commit.sh" | crontab -
fi

# Add new cron entry
(crontab -l 2>/dev/null; echo "$CRON_ENTRY") | crontab -

if [ $? -eq 0 ]; then
    echo "✅ Cron job installed successfully!"
    echo ""
    echo "📊 Current crontab:"
    crontab -l | grep "auto-commit"
    echo ""
    echo "📍 Log file: $LOG_PATH"
    echo ""
    echo "🔍 To monitor auto-commits, run:"
    echo "   tail -f $LOG_PATH"
    echo ""
    echo "🗑️  To remove the cron job, run:"
    echo "   crontab -e"
    echo "   (then delete the line with auto-commit.sh)"
else
    echo "❌ Error: Failed to install cron job"
    echo ""
    echo "This might be due to PAM restrictions. Try:"
    echo "1. Run with sudo if you have access:"
    echo "   sudo bash $0"
    echo ""
    echo "2. Or manually add to crontab:"
    echo "   crontab -e"
    echo "   Then add this line:"
    echo "   $CRON_ENTRY"
    echo ""
    echo "3. Alternative: Use systemd timer (see README.md)"
    exit 1
fi
