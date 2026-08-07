package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import cr.q1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import ts.d0;
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class o implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n.c f39843d = new n.c() { // from class: gr.m
        @Override // com.google.android.exoplayer2.drm.n.c
        public final com.google.android.exoplayer2.drm.n a(UUID uuid) {
            return com.google.android.exoplayer2.drm.o.n(uuid);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f39844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f39845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f39846c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, q1 q1Var) {
            LogSessionId logSessionIdA = q1Var.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            e8.o.a(ts.a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private o(UUID uuid) {
        ts.a.e(uuid);
        ts.a.b(!br.d.f17903b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f39844a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f39845b = mediaDrm;
        this.f39846c = 1;
        if (br.d.f17905d.equals(uuid) && z()) {
            w(mediaDrm);
        }
    }

    public static o A(UUID uuid) throws UnsupportedDrmException {
        try {
            return new o(uuid);
        } catch (UnsupportedSchemeException e11) {
            throw new UnsupportedDrmException(1, e11);
        } catch (Exception e12) {
            throw new UnsupportedDrmException(2, e12);
        }
    }

    public static /* synthetic */ n n(UUID uuid) {
        try {
            return A(uuid);
        } catch (UnsupportedDrmException unused) {
            u.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new l();
        }
    }

    public static /* synthetic */ void o(o oVar, n.b bVar, MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
        oVar.getClass();
        bVar.a(oVar, bArr, i11, i12, bArr2);
    }

    private static byte[] p(byte[] bArr) {
        d0 d0Var = new d0(bArr);
        int iU = d0Var.u();
        short sW = d0Var.w();
        short sW2 = d0Var.w();
        if (sW != 1 || sW2 != 1) {
            u.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sW3 = d0Var.w();
        Charset charset = ou.e.f100002e;
        String strF = d0Var.F(sW3, charset);
        if (strF.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strF.indexOf("</DATA>");
        if (iIndexOf == -1) {
            u.i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strF.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strF.substring(iIndexOf);
        int i11 = iU + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i11);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i11);
        byteBufferAllocate.putShort(sW);
        byteBufferAllocate.putShort(sW2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private static String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        return (p0.f115040a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return br.d.f17904c.equals(uuid) ? com.google.android.exoplayer2.drm.a.a(bArr) : bArr;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e A[RETURN] */
    private static byte[] s(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        UUID uuid2 = br.d.f17906e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = pr.l.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = pr.l.a(uuid2, p(bArr));
        }
        if (p0.f115040a < 23 && br.d.f17905d.equals(uuid)) {
            bArrE = pr.l.e(bArr, uuid);
            if (bArrE != null) {
                return bArrE;
            }
        } else if (uuid2.equals(uuid) && "Amazon".equals(p0.f115042c)) {
            String str = p0.f115043d;
            if ("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) {
                bArrE = pr.l.e(bArr, uuid);
                if (bArrE != null) {
                    return bArrE;
                }
            }
        }
        return bArr;
    }

    private static String t(UUID uuid, String str) {
        return (p0.f115040a < 26 && br.d.f17904c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return (p0.f115040a >= 27 || !br.d.f17904c.equals(uuid)) ? uuid : br.d.f17903b;
    }

    private static void w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static h.b y(UUID uuid, List<h.b> list) {
        if (!br.d.f17905d.equals(uuid)) {
            return list.get(0);
        }
        if (p0.f115040a >= 28 && list.size() > 1) {
            h.b bVar = list.get(0);
            int i11 = 0;
            int length = 0;
            while (true) {
                if (i11 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr2 = (byte[]) ts.a.e(list.get(i13).f39828e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i12, length2);
                        i12 += length2;
                    }
                    return bVar.a(bArr);
                }
                h.b bVar2 = list.get(i11);
                byte[] bArr3 = (byte[]) ts.a.e(bVar2.f39828e);
                if (!p0.c(bVar2.f39827d, bVar.f39827d) || !p0.c(bVar2.f39826c, bVar.f39826c) || !pr.l.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i11++;
            }
        }
        for (int i14 = 0; i14 < list.size(); i14++) {
            h.b bVar3 = list.get(i14);
            int iG = pr.l.g((byte[]) ts.a.e(bVar3.f39828e));
            int i15 = p0.f115040a;
            if ((i15 < 23 && iG == 0) || (i15 >= 23 && iG == 1)) {
                return bVar3;
            }
        }
        return list.get(0);
    }

    private static boolean z() {
        return "ASUS_Z00AD".equals(p0.f115043d);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public Map<String, String> a(byte[] bArr) {
        return this.f39845b.queryKeyStatus(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public n.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f39845b.getProvisionRequest();
        return new n.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] c() {
        return this.f39845b.openSession();
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void d(byte[] bArr, byte[] bArr2) {
        this.f39845b.restoreKeys(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public byte[] e(byte[] bArr, byte[] bArr2) {
        if (br.d.f17904c.equals(this.f39844a)) {
            bArr2 = com.google.android.exoplayer2.drm.a.b(bArr2);
        }
        return this.f39845b.provideKeyResponse(bArr, bArr2);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void f(byte[] bArr) throws DeniedByServerException {
        this.f39845b.provideProvisionResponse(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public int g() {
        return 2;
    }

    @Override // com.google.android.exoplayer2.drm.n
    public boolean i(byte[] bArr, String str) {
        if (p0.f115040a >= 31) {
            return a.a(this.f39845b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f39844a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void j(byte[] bArr) {
        this.f39845b.closeSession(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.n
    @SuppressLint({"WrongConstant"})
    public n.a k(byte[] bArr, List<h.b> list, int i11, HashMap<String, String> map) throws NotProvisionedException {
        h.b bVarY;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarY = y(this.f39844a, list);
            bArrS = s(this.f39844a, (byte[]) ts.a.e(bVarY.f39828e));
            strT = t(this.f39844a, bVarY.f39827d);
        } else {
            bVarY = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f39845b.getKeyRequest(bArr, bArrS, strT, i11, map);
        byte[] bArrR = r(this.f39844a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarY != null && !TextUtils.isEmpty(bVarY.f39826c)) {
            strQ = bVarY.f39826c;
        }
        return new n.a(bArrR, strQ, p0.f115040a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void l(final n.b bVar) {
        this.f39845b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: gr.n
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i11, int i12, byte[] bArr2) {
                com.google.android.exoplayer2.drm.o.o(this.f69371a, bVar, mediaDrm, bArr, i11, i12, bArr2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.drm.n
    public void m(byte[] bArr, q1 q1Var) {
        if (p0.f115040a >= 31) {
            try {
                a.b(this.f39845b, bArr, q1Var);
            } catch (UnsupportedOperationException unused) {
                u.i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    public synchronized void release() {
        int i11 = this.f39846c - 1;
        this.f39846c = i11;
        if (i11 == 0) {
            this.f39845b.release();
        }
    }

    @Override // com.google.android.exoplayer2.drm.n
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public gr.l h(byte[] bArr) {
        return new gr.l(u(this.f39844a), bArr, p0.f115040a < 21 && br.d.f17905d.equals(this.f39844a) && "L3".equals(x("securityLevel")));
    }

    public String x(String str) {
        return this.f39845b.getPropertyString(str);
    }
}
