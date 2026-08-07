package k20;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;
import t20.Size;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b(\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\n\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\u0005\u0010\tR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\rR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\rR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010.\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u00101\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R(\u00103\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010+\"\u0004\b2\u0010-R(\u00106\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R(\u00108\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010+\"\u0004\b7\u0010-R(\u0010:\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010+\"\u0004\b9\u0010-R(\u0010=\u001a\u0004\u0018\u00010\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b;\u0010+\"\u0004\b<\u0010-R(\u0010A\u001a\u0004\u0018\u00010\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b&\u0010>\"\u0004\b?\u0010@R(\u0010D\u001a\u0004\u0018\u00010\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R(\u0010H\u001a\u0004\u0018\u00010!2\b\u0010)\u001a\u0004\u0018\u00010!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u00020%2\u0006\u0010)\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010I\"\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lk20/p;", "Lk20/a;", "Lh20/m;", "<init>", "()V", "a", "Lk20/p;", "getSourceConfig$snowplow_android_tracker_release", "()Lk20/p;", "(Lk20/p;)V", "sourceConfig", "", "b", "Ljava/lang/String;", "_userId", "c", "_networkUserId", DateTokenConverter.CONVERTER_KEY, "_domainUserId", "e", "_useragent", "f", "_ipAddress", "g", "_timezone", "h", "_language", "Lt20/b;", IntegerTokenConverter.CONVERTER_KEY, "Lt20/b;", "_screenResolution", "j", "_screenViewPort", "", "k", "Ljava/lang/Integer;", "_colorDepth", "", "l", "Ljava/lang/Boolean;", "_useContextResourcesScreenResolution", "value", "n", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "userId", "p", "setNetworkUserId", "networkUserId", "setDomainUserId", "domainUserId", "m", "setUseragent", "useragent", "setIpAddress", "ipAddress", "setTimezone", "timezone", "o", "setLanguage", "language", "()Lt20/b;", "setScreenResolution", "(Lt20/b;)V", "screenResolution", "q", "setScreenViewPort", "screenViewPort", "()Ljava/lang/Integer;", "setColorDepth", "(Ljava/lang/Integer;)V", "colorDepth", "()Z", "setUseContextResourcesScreenResolution", "(Z)V", "useContextResourcesScreenResolution", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class p implements a, h20.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private p sourceConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String _userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String _networkUserId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String _domainUserId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String _useragent;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String _ipAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String _timezone;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String _language;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Size _screenResolution;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Size _screenViewPort;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Integer _colorDepth;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean _useContextResourcesScreenResolution;

    public final void a(p pVar) {
        this.sourceConfig = pVar;
    }

    @Override // h20.m
    public String g() {
        String str = this._timezone;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.g();
        }
        return null;
    }

    @Override // h20.m
    public Integer h() {
        Integer num = this._colorDepth;
        if (num != null) {
            return num;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.h();
        }
        return null;
    }

    @Override // h20.m
    public boolean i() {
        Boolean bool = this._useContextResourcesScreenResolution;
        if (bool != null) {
            return bool.booleanValue();
        }
        p pVar = this.sourceConfig;
        Boolean boolValueOf = pVar != null ? Boolean.valueOf(pVar.i()) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // h20.m
    public String j() {
        String str = this._domainUserId;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.j();
        }
        return null;
    }

    @Override // h20.m
    public String k() {
        String str = this._ipAddress;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.k();
        }
        return null;
    }

    @Override // h20.m
    public Size l() {
        Size size = this._screenResolution;
        if (size != null) {
            return size;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.l();
        }
        return null;
    }

    @Override // h20.m
    public String m() {
        String str = this._useragent;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.m();
        }
        return null;
    }

    @Override // h20.m
    public String n() {
        String str = this._userId;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.n();
        }
        return null;
    }

    @Override // h20.m
    public String o() {
        String str = this._language;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.o();
        }
        return null;
    }

    @Override // h20.m
    public String p() {
        String str = this._networkUserId;
        if (str != null) {
            return str;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.p();
        }
        return null;
    }

    @Override // h20.m
    public Size q() {
        Size size = this._screenViewPort;
        if (size != null) {
            return size;
        }
        p pVar = this.sourceConfig;
        if (pVar != null) {
            return pVar.q();
        }
        return null;
    }
}
