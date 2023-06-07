package helpers;

import org.aeonbits.owner.ConfigFactory;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;

public class BrowserstackVideo {
    public static String getVideoUrl(String sessionId) {


        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .log().all()
                .auth().basic("siriusblack_O7laPX", "w5R4AzqsB5a2Z6MMT63X")
                .when()
                .get(url)
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .path("automation_session.video_url");
    }
}

