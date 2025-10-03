# Auto-commit Cron Configuration

## Setup Instructions

### 1. Install the cron job

Run this command to add the cron job:

```bash
crontab -e
```

Then add this line to run auto-commits every 5 minutes:

```cron
*/5 * * * * /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.sh >> /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.log 2>&1
```

### 2. Verify the cron job is installed

```bash
crontab -l
```

### 3. Monitor the auto-commits

Check the log file:

```bash
tail -f /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.log
```

### 4. Remove the cron job (if needed)

```bash
crontab -e
# Then delete the line with auto-commit.sh and save
```

---

## Commit Message Format

The script uses conventional commits with the following format:

```
<type>: <what> | Why: <for> | Impact: <impact>
```

### Commit Types:

- **feat**: New features, code examples, exercises
- **docs**: Documentation updates, theory materials, rubrics
- **chore**: Workspace config, maintenance tasks
- **refactor**: Code reorganization, file removal

### Examples:

```
feat: add Java inheritance examples | Why: demonstrate POO concepts | Impact: practical code reference

docs: update week 1 evaluation rubrics | Why: define clear assessment criteria | Impact: better student evaluation framework

chore: update workspace configuration | Why: optimize development environment | Impact: improved editor experience
```

---

## Script Behavior

The script intelligently detects:

- **File patterns** (rubrics, glossaries, theory, practice, Java files)
- **Change types** (added, modified, deleted files)
- **Context** (which week, which folder)

And generates appropriate commit messages automatically.

---

## Notes

- The script only commits if there are changes
- Commits are local by default (uncomment push line to auto-push)
- Logs are stored in `auto-commit.log`
- The cron runs every 5 minutes (*/5 * * * *)

---

## Troubleshooting

### Cron not running?
```bash
# Check if cron service is running
systemctl status cron

# Start cron if needed
sudo systemctl start cron
```

### Script not executing?
```bash
# Verify script permissions
ls -l /home/epti/Documentos/sena/4T25/oop_java/.github/scripts/auto-commit.sh

# Should show: -rwxr-xr-x
```

### Check recent cron logs
```bash
grep CRON /var/log/syslog | tail -20
```
