package h20;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import t20.Size;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\u0004\"\u0004\b\t\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\u0006R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0004\"\u0004\b\u000f\u0010\u0006R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0004\"\u0004\b\u0012\u0010\u0006R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0004\"\u0004\b\u0015\u0010\u0006R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0006R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\"\u001a\u0004\u0018\u00010\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001e\u0010(\u001a\u0004\u0018\u00010#8&@&X¦\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010.\u001a\u00020)8&@&X¦\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lh20/m;", "", "", "n", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "p", "setNetworkUserId", "networkUserId", "j", "setDomainUserId", "domainUserId", "m", "setUseragent", "useragent", "k", "setIpAddress", "ipAddress", "g", "setTimezone", "timezone", "o", "setLanguage", "language", "Lt20/b;", "l", "()Lt20/b;", "setScreenResolution", "(Lt20/b;)V", "screenResolution", "q", "setScreenViewPort", "screenViewPort", "", "h", "()Ljava/lang/Integer;", "setColorDepth", "(Ljava/lang/Integer;)V", "colorDepth", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "setUseContextResourcesScreenResolution", "(Z)V", "useContextResourcesScreenResolution", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface m {
    String g();

    Integer h();

    boolean i();

    String j();

    String k();

    Size l();

    String m();

    String n();

    String o();

    String p();

    Size q();
}
