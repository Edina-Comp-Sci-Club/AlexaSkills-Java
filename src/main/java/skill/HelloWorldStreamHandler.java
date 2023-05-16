package skill;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import intent.*;

public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        // System handlers
                        new LaunchRequestHandler(),
                        new EndIntentHandler(),
                        new FallBackIntentHandler(),
                        new SessionEndedRequestHandler(),
                        new HelpIntentHandler(),
                        // Skill Handlers
                        new HelloWorldIntentHandler()
                )
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }


}
