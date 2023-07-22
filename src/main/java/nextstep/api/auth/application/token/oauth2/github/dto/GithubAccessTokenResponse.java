package nextstep.api.auth.application.token.oauth2.github.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class GithubAccessTokenResponse {
    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("token_type")
    private String tokenType;
    private String scope;
    private String bearer;

    public GithubAccessTokenResponse(final String accessToken,
                                     final String tokenType,
                                     final String scope,
                                     final String bearer) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.scope = scope;
        this.bearer = bearer;
    }
}
