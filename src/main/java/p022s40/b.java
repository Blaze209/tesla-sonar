package p022s40;

import ezvcard.property.Gender;
import on0.a;
import org.webrtc.PeerConnectionFactory;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0007\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Ls40/b;", "", "", "alpha", "<init>", "(Ljava/lang/String;IF)V", Gender.FEMALE, "getAlpha", "()F", PeerConnectionFactory.TRIAL_ENABLED, "Disabled", "VisuallyDisabled", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
enum b {
    Enabled(1.0f),
    Disabled(0.6f),
    VisuallyDisabled(0.6f);

    private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
    private final float alpha;

    b(float f11) {
        this.alpha = f11;
    }

    public static EnumEntries<b> getEntries() {
        return $ENTRIES;
    }

    public final float getAlpha() {
        return this.alpha;
    }
}
