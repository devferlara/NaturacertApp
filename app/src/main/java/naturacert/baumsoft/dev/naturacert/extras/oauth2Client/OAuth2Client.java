package naturacert.baumsoft.dev.naturacert.extras.oauth2Client;


import naturacert.baumsoft.dev.naturacert.extras.httpConections;

public class OAuth2Client {

	private final String username;
	private final String password;
	private final String clientId;
	private final String clientSecret;
	private final String site;
    public static Token token;

	public OAuth2Client(String username, String password) {
		this.username = username;
		this.password = password;
	    this.clientId = naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuthConstants.mclientId;
        this.clientSecret = naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuthConstants.mclientSecret;
        this.site = httpConections.SERVER;
    }

	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getClientId() {
		return clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public String getSite() {
		return site;
	}


	public Token getAccessToken() {
		naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuth2Config oauthConfig = new naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuth2Config.OAuth2ConfigBuilder(username, password, clientId, clientSecret, site)
			.grantType("password").build();

		return naturacert.baumsoft.dev.naturacert.extras.oauth2Client.OAuthUtils.getAccessToken(oauthConfig);
	}
}
