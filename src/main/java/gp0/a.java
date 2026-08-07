package gp0;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import fp0.c;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.base.d;
import net.time4j.g0;
import net.time4j.tz.m;
import net.time4j.tz.r;
import net.time4j.tz.s;

/* JADX INFO: loaded from: classes9.dex */
public class a implements r, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f69319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, byte[]> f69320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, String> f69321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g0 f69322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<net.time4j.base.a, Integer> f69323f;

    /* JADX WARN: Code duplicated, block: B:79:0x020e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0221  */
    /* JADX WARN: Code duplicated, block: B:89:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0225 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public a() throws Throwable {
        InputStream inputStream;
        String str;
        String string;
        IllegalStateException illegalStateException;
        String str2;
        URI uriF;
        InputStream inputStream2;
        String str3 = "";
        g0 g0VarI0 = (g0) g0.q0().H();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        boolean z11 = System.getProperty("net.time4j.scale.leapseconds.path") != null;
        if (z11) {
            this.f69323f = Collections.EMPTY_MAP;
        } else {
            this.f69323f = new LinkedHashMap(50);
        }
        String property = System.getProperty("net.time4j.tz.repository.path");
        String property2 = System.getProperty("net.time4j.tz.repository.version");
        String str4 = property2 == null ? "tzdata.repository" : "tzdata" + property2 + ".repository";
        try {
            try {
                String str5 = "tzrepo/" + str4;
                if (property != null) {
                    try {
                        File file = new File(property, str4);
                        if (!file.isAbsolute()) {
                            uriF = d.c().f("tzdata", j(), file.toString());
                        } else {
                            if (!file.exists()) {
                                throw new FileNotFoundException("Path to tz-repository not found: " + file);
                            }
                            uriF = file.toURI();
                        }
                    } catch (IOException e11) {
                        e = e11;
                        string = "";
                        str = string;
                        inputStream = null;
                        try {
                            IllegalStateException illegalStateException2 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            illegalStateException = illegalStateException2;
                            str2 = str;
                            if (illegalStateException != null) {
                                throw illegalStateException;
                            }
                            this.f69318a = str2;
                            this.f69319b = string;
                            this.f69320c = Collections.unmodifiableMap(map);
                            this.f69321d = Collections.unmodifiableMap(map2);
                            this.f69322e = g0VarI0;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                } else {
                    uriF = d.c().f("tzdata", j(), str5);
                }
                if (uriF != null) {
                    inputStream2 = d.c().e(uriF, true);
                    try {
                        try {
                            string = uriF.toString();
                        } catch (Throwable th3) {
                            th = th3;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } catch (IOException e12) {
                        e = e12;
                        string = "";
                        str = string;
                        inputStream = inputStream2;
                        IllegalStateException illegalStateException3 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        illegalStateException = illegalStateException3;
                        str2 = str;
                        if (illegalStateException != null) {
                            throw illegalStateException;
                        }
                        this.f69318a = str2;
                        this.f69319b = string;
                        this.f69320c = Collections.unmodifiableMap(map);
                        this.f69321d = Collections.unmodifiableMap(map2);
                        this.f69322e = g0VarI0;
                    }
                } else {
                    string = "";
                    inputStream2 = null;
                }
                if (inputStream2 == null) {
                    try {
                        URL resource = j().getClassLoader().getResource(str5);
                        if (resource == null) {
                            throw new FileNotFoundException("Classloader cannot access tz-repository: " + str5);
                        }
                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(resource.openConnection());
                        uRLConnection.setUseCaches(false);
                        uRLConnection.connect();
                        inputStream2 = uRLConnection.getInputStream();
                        string = resource.toString();
                    } catch (IOException e13) {
                        e = e13;
                        str = "";
                        inputStream = inputStream2;
                        IllegalStateException illegalStateException4 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        illegalStateException = illegalStateException4;
                        str2 = str;
                        if (illegalStateException != null) {
                            throw illegalStateException;
                        }
                        this.f69318a = str2;
                        this.f69319b = string;
                        this.f69320c = Collections.unmodifiableMap(map);
                        this.f69321d = Collections.unmodifiableMap(map2);
                        this.f69322e = g0VarI0;
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(inputStream2);
                h(dataInputStream, string);
                String utf = dataInputStream.readUTF();
                int i11 = dataInputStream.readInt();
                ArrayList arrayList = new ArrayList(i11);
                int i12 = 0;
                while (i12 < i11) {
                    String utf2 = dataInputStream.readUTF();
                    int i13 = dataInputStream.readInt();
                    byte[] bArr = new byte[i13];
                    boolean z12 = z11;
                    str = str3;
                    int i14 = 0;
                    do {
                        try {
                            i14 += dataInputStream.read(bArr, i14, i13 - i14);
                            if (i14 == -1) {
                                throw new EOFException("Incomplete data: " + utf2);
                            }
                        } catch (IOException e14) {
                            e = e14;
                            inputStream = inputStream2;
                            IllegalStateException illegalStateException5 = new IllegalStateException("[ERROR] TZ-repository not available. => " + e.getMessage(), e);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            illegalStateException = illegalStateException5;
                            str2 = str;
                            if (illegalStateException != null) {
                                throw illegalStateException;
                            }
                            this.f69318a = str2;
                            this.f69319b = string;
                            this.f69320c = Collections.unmodifiableMap(map);
                            this.f69321d = Collections.unmodifiableMap(map2);
                            this.f69322e = g0VarI0;
                        }
                    } while (i13 > i14);
                    arrayList.add(utf2);
                    map.put(utf2, bArr);
                    i12++;
                    z11 = z12;
                    str3 = str;
                }
                boolean z13 = z11;
                short s11 = dataInputStream.readShort();
                for (int i15 = 0; i15 < s11; i15++) {
                    map2.put(dataInputStream.readUTF(), (String) arrayList.get(dataInputStream.readShort()));
                }
                if (!z13) {
                    short s12 = dataInputStream.readShort();
                    for (int i16 = 0; i16 < s12; i16++) {
                        this.f69323f.put(g0.I0(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte()), Integer.valueOf(dataInputStream.readByte()));
                    }
                    g0VarI0 = g0.I0(dataInputStream.readShort(), dataInputStream.readByte(), dataInputStream.readByte());
                }
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                    }
                }
                str2 = utf;
                illegalStateException = null;
            } catch (IOException e15) {
                e = e15;
                str = "";
                string = str;
            }
            if (illegalStateException != null) {
                throw illegalStateException;
            }
            this.f69318a = str2;
            this.f69319b = string;
            this.f69320c = Collections.unmodifiableMap(map);
            this.f69321d = Collections.unmodifiableMap(map2);
            this.f69322e = g0VarI0;
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
        }
    }

    private static void h(DataInputStream dataInputStream, String str) throws IOException {
        byte b11 = dataInputStream.readByte();
        byte b12 = dataInputStream.readByte();
        byte b13 = dataInputStream.readByte();
        byte b14 = dataInputStream.readByte();
        byte b15 = dataInputStream.readByte();
        byte b16 = dataInputStream.readByte();
        if (b11 == 116 && b12 == 122 && b13 == 114 && b14 == 101 && b15 == 112 && b16 == 111) {
            return;
        }
        throw new IOException("Invalid tz-repository: " + str);
    }

    private static Class<?> j() {
        if (!Boolean.getBoolean("test.environment")) {
            return a.class;
        }
        try {
            return Class.forName("net.time4j.tz.spi.RepositoryTest");
        } catch (ClassNotFoundException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // net.time4j.tz.r
    public s a() {
        return null;
    }

    @Override // fp0.c
    public boolean b() {
        return !this.f69323f.isEmpty();
    }

    @Override // net.time4j.tz.r
    public String d() {
        return "";
    }

    @Override // net.time4j.tz.r
    public Map<String, String> e() {
        return this.f69321d;
    }

    @Override // fp0.c
    public Map<net.time4j.base.a, Integer> f() {
        return Collections.unmodifiableMap(this.f69323f);
    }

    @Override // net.time4j.tz.r
    public Set<String> g() {
        return this.f69320c.keySet();
    }

    @Override // net.time4j.tz.r
    public String getLocation() {
        return this.f69319b;
    }

    @Override // net.time4j.tz.r
    public String getName() {
        return "TZDB";
    }

    @Override // net.time4j.tz.r
    public String getVersion() {
        return this.f69318a;
    }

    @Override // fp0.c
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public g0 c() {
        return this.f69322e;
    }

    @Override // net.time4j.tz.r
    public m load(String str) {
        try {
            byte[] bArr = this.f69320c.get(str);
            if (bArr != null) {
                return (m) new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            }
            return null;
        } catch (IOException e11) {
            e11.printStackTrace();
            return null;
        } catch (ClassNotFoundException e12) {
            e12.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "TZ-REPOSITORY(" + this.f69318a + ")";
    }
}
