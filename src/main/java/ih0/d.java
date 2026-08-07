package ih0;

import a30.g;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.fourthline.analytics.internal.AnalyticsContext;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0016"}, d2 = {"Lih0/d;", "La30/g;", "", AnalyticsContext.Screen, "", "isEnabled", "", "name", "<init>", "(Ljava/lang/Object;ZLjava/lang/String;)V", "b", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "a", "compatibilityKey", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object screen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public d(Object screen, boolean z11, String name) {
        s.k(screen, "screen");
        s.k(name, "name");
        this.screen = screen;
        this.isEnabled = z11;
        this.name = name;
    }

    @Override // a30.g
    /* JADX INFO: renamed from: a, reason: from getter */
    public String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Object getScreen() {
        return this.screen;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }
}
