package androidx.media3.exoplayer.drm;

import android.net.Uri;
import android.text.TextUtils;
import com.google.common.collect.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.datasource.a.InterfaceC0192a f9818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f9819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f9820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f9821d;

    public o(String str, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
        this(str, false, interfaceC0192a);
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] a(UUID uuid, m.a aVar) throws MediaDrmCallbackException {
        String str;
        String strB = aVar.b();
        if (this.f9820c || TextUtils.isEmpty(strB)) {
            strB = this.f9819b;
        }
        if (TextUtils.isEmpty(strB)) {
            v7.j.b bVar = new v7.j.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.i(uri).a(), uri, z.m(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = p7.h.f101352e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = p7.h.f101350c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f9821d) {
            map.putAll(this.f9821d);
        }
        return j.a(this.f9818a.a(), strB, aVar.a(), map);
    }

    @Override // androidx.media3.exoplayer.drm.p
    public byte[] b(UUID uuid, m.d dVar) {
        return j.a(this.f9818a.a(), dVar.b() + "&signedRequest=" + q0.K(dVar.a()), null, Collections.EMPTY_MAP);
    }

    public void c(String str, String str2) {
        s7.a.f(str);
        s7.a.f(str2);
        synchronized (this.f9821d) {
            this.f9821d.put(str, str2);
        }
    }

    public o(String str, boolean z11, androidx.media3.datasource.a.InterfaceC0192a interfaceC0192a) {
        s7.a.a((z11 && TextUtils.isEmpty(str)) ? false : true);
        this.f9818a = interfaceC0192a;
        this.f9819b = str;
        this.f9820c = z11;
        this.f9821d = new HashMap();
    }
}
