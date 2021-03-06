package statistics.matcher;

import statistics.Player;

public class And implements Matcher {

    private Matcher[] matchers;

    public And(Matcher... matchers) {
        this.matchers = matchers;
    }

    @Override
    public boolean test(Player p) {
        for (Matcher matcher : matchers) {
            if (!matcher.test(p)) {
                return false;
            }
        }

        return true;
    }
}
