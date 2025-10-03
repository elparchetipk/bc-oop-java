#!/bin/bash

# Auto-commit script with conventional commits
# Format: <type>: <what> | Why: <for> | Impact: <impact>

cd /home/epti/Documentos/sena/4T25/oop_java || exit 1

# Check if there are changes
if [[ -z $(git status -s) ]]; then
    echo "No changes to commit"
    exit 0
fi

# Get current timestamp
TIMESTAMP=$(date '+%Y-%m-%d %H:%M:%S')

# Analyze changes to determine commit type and message
CHANGED_FILES=$(git status -s)
ADDED_FILES=$(echo "$CHANGED_FILES" | grep -c "^A\|^??")
MODIFIED_FILES=$(echo "$CHANGED_FILES" | grep -c "^ M\|^M")
DELETED_FILES=$(echo "$CHANGED_FILES" | grep -c "^ D\|^D")

# Determine the main type of change
if [ "$ADDED_FILES" -gt 0 ] && [ "$MODIFIED_FILES" -eq 0 ] && [ "$DELETED_FILES" -eq 0 ]; then
    TYPE="feat"
    WHAT="add new files and resources"
    WHY="expand project content and structure"
    IMPACT="new materials available for bootcamp"
elif [ "$MODIFIED_FILES" -gt 0 ] && [ "$ADDED_FILES" -eq 0 ] && [ "$DELETED_FILES" -eq 0 ]; then
    TYPE="docs"
    WHAT="update existing documentation and code"
    WHY="improve content quality and accuracy"
    IMPACT="enhanced learning materials"
elif [ "$DELETED_FILES" -gt 0 ]; then
    TYPE="refactor"
    WHAT="remove obsolete files"
    WHY="maintain clean project structure"
    IMPACT="improved organization"
else
    TYPE="chore"
    WHAT="update multiple files ($ADDED_FILES added, $MODIFIED_FILES modified, $DELETED_FILES deleted)"
    WHY="maintain project consistency"
    IMPACT="incremental progress on bootcamp materials"
fi

# Check specific file patterns for more accurate types
if echo "$CHANGED_FILES" | grep -q "RUBRICA_EVALUACION"; then
    TYPE="docs"
    WHAT="update evaluation rubrics"
    WHY="define clear assessment criteria"
    IMPACT="better student evaluation framework"
elif echo "$CHANGED_FILES" | grep -q "glosario.md"; then
    TYPE="docs"
    WHAT="update glossary terms"
    WHY="clarify key concepts"
    IMPACT="improved concept understanding"
elif echo "$CHANGED_FILES" | grep -q "1-teoria/"; then
    TYPE="docs"
    WHAT="update theoretical materials"
    WHY="enhance learning resources"
    IMPACT="better conceptual foundation"
elif echo "$CHANGED_FILES" | grep -q "2-practica/"; then
    TYPE="feat"
    WHAT="add/update practical exercises"
    WHY="provide hands-on learning"
    IMPACT="improved skill development"
elif echo "$CHANGED_FILES" | grep -q ".java"; then
    TYPE="feat"
    WHAT="add/update Java code examples"
    WHY="demonstrate POO concepts"
    IMPACT="practical code reference"
elif echo "$CHANGED_FILES" | grep -q ".vscode/"; then
    TYPE="chore"
    WHAT="update workspace configuration"
    WHY="optimize development environment"
    IMPACT="improved editor experience"
elif echo "$CHANGED_FILES" | grep -q "copilot-instructions"; then
    TYPE="docs"
    WHAT="update Copilot instructions"
    WHY="improve AI assistance accuracy"
    IMPACT="better content generation"
fi

# Create commit message
COMMIT_MSG="$TYPE: $WHAT | Why: $WHY | Impact: $IMPACT

Auto-commit at $TIMESTAMP"

# Add all changes
git add -A

# Commit with the generated message
git commit -m "$COMMIT_MSG"

# Optional: Push to remote (uncomment if desired)
# git push origin main

echo "✓ Auto-commit completed: $TYPE"
echo "  What: $WHAT"
echo "  Why: $WHY"
echo "  Impact: $IMPACT"
