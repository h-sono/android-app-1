## android-app-1
- android studioのプロジェクトapp-1のソースコードを管理。
- Githubとの連携にGithubで発行したトークンを使用。90日設定。
※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

### Githubでトークンの発行/設定
- GithubプロフィールのSettings > Developer Settings > Personal access tokens > Tokens(classic)を開く。
- トークン生成。
- Select scopesはrepoとadmin:orgのreading、gistにチェック。
- Generate token押下。

### Android Studioでトークンを登録
- Git > Github > Share Project on Githubを押下。
- Add accountを押下し、Log in with Tokenを選択。
- トークン欄にGithubで発行したトークンを入れる。
- 詳細はhttps://qiita.com/TAKANEKOMACHI/items/0101f0ff88fad2696e81

### コミット/プッシュ
- Android Studioの左のCommitを押下。
- コミットするファイルを選択し、コミットメッセージ入力。
- Commitを押下。
- 上部メニューのGit > Pushを押下。
