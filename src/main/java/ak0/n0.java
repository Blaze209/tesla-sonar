package ak0;

import ezvcard.property.Profile;

/* JADX INFO: loaded from: classes8.dex */
public class n0 extends y0<Profile> {
    public n0() {
        super(Profile.class, "PROFILE");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ak0.t0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Profile i(String str) {
        Profile profile = new Profile();
        profile.setValue(str);
        return profile;
    }
}
