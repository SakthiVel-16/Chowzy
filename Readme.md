To set up Git in **VS Code**, follow these steps:

---

### ✅ 1. **Install Git (if not already installed)**

You can download it from:  
👉 [https://git-scm.com/downloads](https://git-scm.com/downloads)

---

### ✅ 2. **Configure Git (first time only)**

Open **Terminal** inside VS Code (`Ctrl + `) and run:

```bash
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

---

### ✅ 3. **Initialize a Git repo in your project folder**

Open your project in VS Code, then run:

```bash
git init
```

---

### ✅ 4. **Add and Commit files**

```bash
git add .
git commit -m "Initial commit"
```

---

### ✅ 5. **(Optional) Link to a remote repository**

If you have a GitHub repo:

```bash
git remote add origin https://github.com/yourusername/your-repo-name.git
git push -u origin master  # or main, depending on your default branch
```

---

### ✅ 6. **Use Git GUI in VS Code**

Click the **Source Control icon** on the left sidebar (or press `Ctrl+Shift+G`) to interact with Git visually (stage, commit, push, pull, etc.)

---

Let me know if you want help creating a GitHub repo, generating SSH keys, or pushing changes!
