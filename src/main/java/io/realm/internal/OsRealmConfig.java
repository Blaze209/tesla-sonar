package io.realm.internal;

import io.realm.CompactOnLaunchCallback;
import io.realm.i0;
import io.realm.log.RealmLog;
import java.io.File;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class OsRealmConfig implements h {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f79006j = nativeGetFinalizerPtr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f79007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f79008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0 f79009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final URI f79010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f79011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f79012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CompactOnLaunchCallback f79013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final OsSharedRealm.MigrationCallback f79014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final OsSharedRealm.InitializationCallback f79015i;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f79016a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            f79016a = iArr;
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i0 f79017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private OsSchemaInfo f79018b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private OsSharedRealm.MigrationCallback f79019c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private OsSharedRealm.InitializationCallback f79020d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f79021e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f79022f = "";

        public b(i0 i0Var) {
            this.f79017a = i0Var;
        }

        public b a(boolean z11) {
            this.f79021e = z11;
            return this;
        }

        public OsRealmConfig b() {
            return new OsRealmConfig(this.f79017a, this.f79022f, this.f79021e, this.f79018b, this.f79019c, this.f79020d, null);
        }

        public b c(File file) {
            this.f79022f = file.getAbsolutePath();
            return this;
        }

        public b d(OsSharedRealm.InitializationCallback initializationCallback) {
            this.f79020d = initializationCallback;
            return this;
        }

        public b e(OsSharedRealm.MigrationCallback migrationCallback) {
            this.f79019c = migrationCallback;
            return this;
        }

        public b f(OsSchemaInfo osSchemaInfo) {
            this.f79018b = osSchemaInfo;
            return this;
        }
    }

    public enum c {
        FULL(0),
        MEM_ONLY(1);

        final int value;

        c(int i11) {
            this.value = i11;
        }
    }

    public enum d {
        SCHEMA_MODE_AUTOMATIC((byte) 0),
        SCHEMA_MODE_IMMUTABLE((byte) 1),
        SCHEMA_MODE_READONLY((byte) 2),
        SCHEMA_MODE_SOFT_RESET_FILE((byte) 3),
        SCHEMA_MODE_ADDITIVE_DISCOVERED((byte) 5),
        SCHEMA_MODE_MANUAL((byte) 7);

        final byte value;

        d(byte b11) {
            this.value = b11;
        }

        public byte getNativeValue() {
            return this.value;
        }
    }

    /* synthetic */ OsRealmConfig(i0 i0Var, String str, boolean z11, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback, a aVar) {
        this(i0Var, str, z11, osSchemaInfo, migrationCallback, initializationCallback);
    }

    private String b(InetSocketAddress inetSocketAddress) {
        if (inetSocketAddress.getHostName() != null) {
            return inetSocketAddress.getHostName();
        }
        if (inetSocketAddress.getAddress() == null) {
            return null;
        }
        InetAddress address = inetSocketAddress.getAddress();
        return address.getHostName() != null ? address.getHostName() : address.getHostAddress();
    }

    private static native long nativeCreate(String str, String str2, boolean z11, long j11);

    private native String nativeCreateAndSetSyncConfig(long j11, long j12, String str, String str2, String str3, String str4, String str5, String str6, byte b11, String str7, String str8, String[] strArr, byte b12, Object obj, Object obj2, String str9, Object obj3);

    private static native void nativeEnableChangeNotification(long j11, boolean z11);

    private static native long nativeGetFinalizerPtr();

    private static native void nativeSetCompactOnLaunchCallback(long j11, CompactOnLaunchCallback compactOnLaunchCallback);

    private static native void nativeSetEncryptionKey(long j11, byte[] bArr);

    private static native void nativeSetInMemory(long j11, boolean z11);

    private native void nativeSetInitializationCallback(long j11, OsSharedRealm.InitializationCallback initializationCallback);

    private native void nativeSetSchemaConfig(long j11, byte b11, long j12, long j13, OsSharedRealm.MigrationCallback migrationCallback);

    private static native void nativeSetSyncConfigProxySettings(long j11, byte b11, String str, int i11);

    private static native void nativeSetSyncConfigSslSettings(long j11, boolean z11, String str);

    g a() {
        return this.f79012f;
    }

    public i0 c() {
        return this.f79009c;
    }

    public URI d() {
        return this.f79010d;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f79006j;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f79011e;
    }

    private OsRealmConfig(i0 i0Var, String str, boolean z11, OsSchemaInfo osSchemaInfo, OsSharedRealm.MigrationCallback migrationCallback, OsSharedRealm.InitializationCallback initializationCallback) {
        OsRealmConfig osRealmConfig;
        URI uri;
        String str2;
        String str3;
        int i11;
        URI uri2;
        this.f79012f = new g();
        this.f79009c = i0Var;
        this.f79011e = nativeCreate(i0Var.k(), str, true, i0Var.h());
        g.f79082c.a(this);
        Object[] objArrD = i.e().d(i0Var);
        String str4 = (String) objArrD[0];
        String str5 = (String) objArrD[1];
        String str6 = (String) objArrD[2];
        String str7 = (String) objArrD[3];
        String str8 = (String) objArrD[4];
        String str9 = (String) objArrD[5];
        String str10 = (String) objArrD[6];
        Byte b11 = (Byte) objArrD[7];
        String str11 = (String) objArrD[8];
        String str12 = (String) objArrD[9];
        Map map = (Map) objArrD[10];
        Byte b12 = (Byte) objArrD[11];
        this.f79007a = objArrD[12];
        this.f79008b = objArrD[13];
        String str13 = (String) objArrD[14];
        Object obj = objArrD[15];
        Long l11 = (Long) objArrD[16];
        boolean zEquals = Boolean.TRUE.equals(objArrD[17]);
        String str14 = (String) objArrD[18];
        String[] strArr = new String[map != null ? map.size() * 2 : 0];
        if (map != null) {
            int i12 = 0;
            for (Map.Entry entry : map.entrySet()) {
                strArr[i12] = (String) entry.getKey();
                strArr[i12 + 1] = (String) entry.getValue();
                i12 += 2;
            }
        }
        byte[] bArrF = i0Var.f();
        if (bArrF != null) {
            nativeSetEncryptionKey(this.f79011e, bArrF);
        }
        nativeSetInMemory(this.f79011e, i0Var.e() == c.MEM_ONLY);
        nativeEnableChangeNotification(this.f79011e, z11);
        d dVar = d.SCHEMA_MODE_MANUAL;
        if (i0Var.s()) {
            dVar = d.SCHEMA_MODE_IMMUTABLE;
        } else if (i0Var.r()) {
            dVar = d.SCHEMA_MODE_READONLY;
        } else if (str6 != null) {
            dVar = d.SCHEMA_MODE_ADDITIVE_DISCOVERED;
        } else if (i0Var.v()) {
            dVar = d.SCHEMA_MODE_SOFT_RESET_FILE;
        }
        long jO = i0Var.o();
        long nativePtr = osSchemaInfo == null ? 0L : osSchemaInfo.getNativePtr();
        this.f79014h = migrationCallback;
        nativeSetSchemaConfig(this.f79011e, dVar.getNativeValue(), jO, nativePtr, migrationCallback);
        CompactOnLaunchCallback compactOnLaunchCallbackD = i0Var.d();
        this.f79013g = compactOnLaunchCallbackD;
        if (compactOnLaunchCallbackD != null) {
            nativeSetCompactOnLaunchCallback(this.f79011e, compactOnLaunchCallbackD);
        }
        this.f79015i = initializationCallback;
        if (initializationCallback != null) {
            nativeSetInitializationCallback(this.f79011e, initializationCallback);
        }
        if (str6 != null) {
            osRealmConfig = this;
            String strNativeCreateAndSetSyncConfig = osRealmConfig.nativeCreateAndSetSyncConfig(l11.longValue(), this.f79011e, str6, str4, str5, str8, str9, str10, b11.byteValue(), str11, str12, strArr, b12.byteValue(), this.f79007a, this.f79008b, str13, obj);
            try {
                strNativeCreateAndSetSyncConfig = str7 + str11.substring(1);
                uri = new URI(strNativeCreateAndSetSyncConfig);
                str3 = strNativeCreateAndSetSyncConfig;
                str2 = "Cannot create a URI from the Realm URL address";
            } catch (URISyntaxException e11) {
                str2 = "Cannot create a URI from the Realm URL address";
                RealmLog.b(e11, str2, new Object[0]);
                str3 = strNativeCreateAndSetSyncConfig;
                uri = null;
            }
            nativeSetSyncConfigSslSettings(osRealmConfig.f79011e, zEquals, str14);
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (uri != null && proxySelector != null) {
                try {
                    uri2 = new URI(str3.replaceFirst("ws", "http"));
                    i11 = 0;
                } catch (URISyntaxException e12) {
                    i11 = 0;
                    RealmLog.b(e12, str2, new Object[0]);
                    uri2 = null;
                }
                List<Proxy> listSelect = proxySelector.select(uri2);
                if (listSelect != null && !listSelect.isEmpty()) {
                    Proxy proxy = listSelect.get(i11);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        byte b13 = a.f79016a[proxy.type().ordinal()] != 1 ? (byte) -1 : (byte) 0;
                        if (proxy.type() == Proxy.Type.HTTP) {
                            SocketAddress socketAddressAddress = proxy.address();
                            if (socketAddressAddress instanceof InetSocketAddress) {
                                InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                                String strB = osRealmConfig.b(inetSocketAddress);
                                if (strB != null) {
                                    nativeSetSyncConfigProxySettings(osRealmConfig.f79011e, b13, strB, inetSocketAddress.getPort());
                                } else {
                                    RealmLog.a("Could not retrieve proxy's hostname.", new Object[0]);
                                }
                            } else {
                                RealmLog.a("Unsupported proxy socket address type: " + socketAddressAddress.getClass().getName(), new Object[0]);
                            }
                        } else {
                            RealmLog.a("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
        } else {
            osRealmConfig = this;
            uri = null;
        }
        osRealmConfig.f79010d = uri;
    }
}
