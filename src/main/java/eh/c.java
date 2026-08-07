package eh;

import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f62940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f62941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f62942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f62943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f62944g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f62945h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f62946i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f62947j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f62948k = "";

    public String a() {
        String str = this.f62943f;
        return str == null ? WebrtcBuildVersion.maint_version : str;
    }

    public boolean b() {
        return "1".equals(this.f62942e);
    }

    public int c() {
        if (this.f62938a) {
            return sg.a.c(this.f62940c) ? 2 : 1;
        }
        return "APPKEY_ERROR".equals(this.f62939b) ? 3 : 2;
    }
}
