package naturacert.baumsoft.dev.naturacert.extras.oauth2Client;


import naturacert.baumsoft.dev.naturacert.extras.httpConections;

public class Token {

		private final Long expiresIn;
		private final Long expiresAt;
		private final String tokenType;
		private final String refreshToken;
		private final String accessToken;
		
		
		public Token(Long expiresIn, String tokenType, String refreshToken, String accessToken) {
			this.expiresIn = expiresIn;
			this.tokenType = tokenType;
			this.refreshToken = refreshToken;
			this.accessToken = accessToken;
			this.expiresAt = (expiresIn * 1000) + System.currentTimeMillis();
		}


		public Long getExpiresIn() {
			return expiresIn;
		}
		public Long getExpiresAt() {
			return expiresAt;
		}
		public String getTokenType() {
			return tokenType;
		}
		public String getRefreshToken() {
			return refreshToken;
		}
		public String getAccessToken() {
			return accessToken;
		}


		public boolean isExpired() {
			return (System.currentTimeMillis() >= this.getExpiresAt()) ? true : false;
		}
		
    	public String getResource(Token token, String path) {
			return OAuthUtils.getProtectedResource(token, path);
		}

		public Token refresh() {
			OAuth2Config oauthConfig = new OAuth2Config.OAuth2ConfigBuilder(OAuthConstants.mclientId, OAuthConstants.mclientId, httpConections.SERVER)
				.grantType("refresh_token").build();
			return OAuthUtils.refreshAccessToken(this, oauthConfig);
		}
}
