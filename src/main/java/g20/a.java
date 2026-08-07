package g20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.internal.ImagesContract;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\u000b\u0010\nR\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\r\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lg20/a;", "Lg20/f;", "", ImagesContract.URL, "referrer", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "(Z)V", "readyForOutput", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String referrer;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean readyForOutput;

    public a(String url, String str) {
        s.k(url, "url");
        this.url = url;
        this.referrer = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getReadyForOutput() {
        return this.readyForOutput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getReferrer() {
        return this.referrer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final void d(boolean z11) {
        this.readyForOutput = z11;
    }
}
