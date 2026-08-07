package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import ch.qos.logback.core.joran.action.Action;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.google.common.collect.b0;
import com.google.common.collect.d1;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, e> f9220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f9221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f9222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f9223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f9224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f9225f;

    private static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String[] f9226e = {"id", Action.KEY_ATTRIBUTE, OrcaKeys.METADATA};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final u7.a f9227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<e> f9228b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f9229c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f9230d;

        public a(u7.a aVar) {
            this.f9227a = aVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, e eVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            f.r(eVar.c(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(eVar.f9213a));
            contentValues.put(Action.KEY_ATTRIBUTE, eVar.f9214b);
            contentValues.put(OrcaKeys.METADATA, byteArray);
            sQLiteDatabase.replaceOrThrow((String) s7.a.f(this.f9230d), null, contentValues);
        }

        private static void j(u7.a aVar, String str) throws DatabaseIOException {
            try {
                String strN = n(str);
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    u7.c.c(writableDatabase, 1, str);
                    l(writableDatabase, strN);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        private void k(SQLiteDatabase sQLiteDatabase, int i11) {
            sQLiteDatabase.delete((String) s7.a.f(this.f9230d), "id = ?", new String[]{Integer.toString(i11)});
        }

        private static void l(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private Cursor m() {
            return this.f9227a.getReadableDatabase().query((String) s7.a.f(this.f9230d), f9226e, null, null, null, null, null);
        }

        private static String n(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        private void o(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            u7.c.d(sQLiteDatabase, 1, (String) s7.a.f(this.f9229c), 1);
            l(sQLiteDatabase, (String) s7.a.f(this.f9230d));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f9230d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void a(long j11) {
            String hexString = Long.toHexString(j11);
            this.f9229c = hexString;
            this.f9230d = n(hexString);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap<String, e> map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f9227a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o(writableDatabase);
                    Iterator<e> it = map.values().iterator();
                    while (it.hasNext()) {
                        i(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f9228b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void c(e eVar) {
            this.f9228b.put(eVar.f9213a, eVar);
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean d() throws DatabaseIOException {
            try {
                return u7.c.b(this.f9227a.getReadableDatabase(), 1, (String) s7.a.f(this.f9229c)) != -1;
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(HashMap<String, e> map) throws DatabaseIOException {
            if (this.f9228b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f9227a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i11 = 0; i11 < this.f9228b.size(); i11++) {
                    try {
                        e eVarValueAt = this.f9228b.valueAt(i11);
                        if (eVarValueAt == null) {
                            k(writableDatabase, this.f9228b.keyAt(i11));
                        } else {
                            i(writableDatabase, eVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f9228b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e11) {
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar, boolean z11) {
            if (z11) {
                this.f9228b.delete(eVar.f9213a);
            } else {
                this.f9228b.put(eVar.f9213a, null);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(HashMap<String, e> map, SparseArray<String> sparseArray) throws DatabaseIOException {
            s7.a.h(this.f9228b.size() == 0);
            try {
                if (u7.c.b(this.f9227a.getReadableDatabase(), 1, (String) s7.a.f(this.f9229c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f9227a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        o(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorM = m();
                while (cursorM.moveToNext()) {
                    try {
                        e eVar = new e(cursorM.getInt(0), (String) s7.a.f(cursorM.getString(1)), f.o(new DataInputStream(new ByteArrayInputStream(cursorM.getBlob(2)))));
                        map.put(eVar.f9214b, eVar);
                        sparseArray.put(eVar.f9213a, eVar.f9214b);
                    } catch (Throwable th3) {
                        if (cursorM != null) {
                            try {
                                cursorM.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorM.close();
            } catch (SQLiteException e11) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e11);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h() throws DatabaseIOException {
            j(this.f9227a, (String) s7.a.f(this.f9229c));
        }
    }

    private static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f9231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cipher f9232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SecretKeySpec f9233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final SecureRandom f9234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final s7.b f9235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g f9237g;

        public b(File file, byte[] bArr, boolean z11) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            s7.a.h((bArr == null && z11) ? false : true);
            if (bArr != null) {
                s7.a.a(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e11) {
                    throw new IllegalStateException(e11);
                }
            } else {
                s7.a.a(!z11);
                cipher = null;
                secretKeySpec = null;
            }
            this.f9231a = z11;
            this.f9232b = cipher;
            this.f9233c = secretKeySpec;
            this.f9234d = z11 ? new SecureRandom() : null;
            this.f9235e = new s7.b(file);
        }

        private int i(e eVar, int i11) {
            int i12;
            int iHashCode;
            int iHashCode2 = (eVar.f9213a * 31) + eVar.f9214b.hashCode();
            if (i11 < 2) {
                long jA = w7.d.a(eVar.c());
                i12 = iHashCode2 * 31;
                iHashCode = (int) (jA ^ (jA >>> 32));
            } else {
                i12 = iHashCode2 * 31;
                iHashCode = eVar.c().hashCode();
            }
            return i12 + iHashCode;
        }

        private e j(int i11, DataInputStream dataInputStream) throws IOException {
            w7.f fVarO;
            int i12 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i11 < 2) {
                long j11 = dataInputStream.readLong();
                w7.e eVar = new w7.e();
                w7.e.g(eVar, j11);
                fVarO = w7.f.f121100c.g(eVar);
            } else {
                fVarO = f.o(dataInputStream);
            }
            return new e(i12, utf, fVarO);
        }

        private boolean k(HashMap<String, e> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f9235e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f9235e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i11 = dataInputStream2.readInt();
                    if (i11 >= 0 && i11 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f9232b == null) {
                                q0.p(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f9232b.init(2, (Key) q0.l(this.f9233c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f9232b));
                            } catch (InvalidAlgorithmParameterException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e12) {
                                e = e12;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f9231a) {
                            this.f9236f = true;
                        }
                        int i12 = dataInputStream2.readInt();
                        int i13 = 0;
                        for (int i14 = 0; i14 < i12; i14++) {
                            e eVarJ = j(i11, dataInputStream2);
                            map.put(eVarJ.f9214b, eVarJ);
                            sparseArray.put(eVarJ.f9213a, eVarJ.f9214b);
                            i13 += i(eVarJ, i11);
                        }
                        int i15 = dataInputStream2.readInt();
                        boolean z11 = dataInputStream2.read() == -1;
                        if (i15 == i13 && z11) {
                            q0.p(dataInputStream2);
                            return true;
                        }
                        q0.p(dataInputStream2);
                        return false;
                    }
                    q0.p(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        q0.p(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        q0.p(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void l(e eVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(eVar.f9213a);
            dataOutputStream.writeUTF(eVar.f9214b);
            f.r(eVar.c(), dataOutputStream);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void m(HashMap<String, e> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.f9235e.f();
                g gVar = this.f9237g;
                if (gVar == null) {
                    this.f9237g = new g(outputStreamF);
                } else {
                    gVar.c(outputStreamF);
                }
                g gVar2 = this.f9237g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(gVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    dataOutputStream2.writeInt(this.f9231a ? 1 : 0);
                    if (this.f9231a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) q0.l(this.f9234d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) q0.l(this.f9232b)).init(1, (Key) q0.l(this.f9233c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(gVar2, this.f9232b));
                        } catch (InvalidAlgorithmParameterException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e12) {
                            e = e12;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    int i11 = 0;
                    for (e eVar : map.values()) {
                        l(eVar, dataOutputStream2);
                        i11 += i(eVar, 2);
                    }
                    dataOutputStream2.writeInt(i11);
                    this.f9235e.b(dataOutputStream2);
                    q0.p(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    q0.p(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void a(long j11) {
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void b(HashMap<String, e> map) throws Throwable {
            m(map);
            this.f9236f = false;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void c(e eVar) {
            this.f9236f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public boolean d() {
            return this.f9235e.c();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void e(HashMap<String, e> map) throws Throwable {
            if (this.f9236f) {
                b(map);
            }
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void f(e eVar, boolean z11) {
            this.f9236f = true;
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void g(HashMap<String, e> map, SparseArray<String> sparseArray) {
            s7.a.h(!this.f9236f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f9235e.a();
        }

        @Override // androidx.media3.datasource.cache.f.c
        public void h() {
            this.f9235e.a();
        }
    }

    private interface c {
        void a(long j11);

        void b(HashMap<String, e> map);

        void c(e eVar);

        boolean d();

        void e(HashMap<String, e> map);

        void f(e eVar, boolean z11);

        void g(HashMap<String, e> map, SparseArray<String> sparseArray);

        void h();
    }

    public f(u7.a aVar, File file, byte[] bArr, boolean z11, boolean z12) {
        s7.a.h((aVar == null && file == null) ? false : true);
        this.f9220a = new HashMap<>();
        this.f9221b = new SparseArray<>();
        this.f9222c = new SparseBooleanArray();
        this.f9223d = new SparseBooleanArray();
        a aVar2 = aVar != null ? new a(aVar) : null;
        b bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z11) : null;
        if (aVar2 == null || (bVar != null && z12)) {
            this.f9224e = (c) q0.l(bVar);
            this.f9225f = aVar2;
        } else {
            this.f9224e = aVar2;
            this.f9225f = bVar;
        }
    }

    private e c(String str) {
        int iJ = j(this.f9221b);
        e eVar = new e(iJ, str);
        this.f9220a.put(str, eVar);
        this.f9221b.put(iJ, str);
        this.f9223d.put(iJ, true);
        this.f9224e.c(eVar);
        return eVar;
    }

    static int j(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i11 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i11 < size && i11 == sparseArray.keyAt(i11)) {
            i11++;
        }
        return i11;
    }

    public static boolean m(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static w7.f o(DataInputStream dataInputStream) throws IOException {
        int i11 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < i11; i12++) {
            String utf = dataInputStream.readUTF();
            int i13 = dataInputStream.readInt();
            if (i13 < 0) {
                throw new IOException("Invalid value size: " + i13);
            }
            int iMin = Math.min(i13, 10485760);
            byte[] bArrCopyOf = q0.f110459f;
            int i14 = 0;
            while (i14 != i13) {
                int i15 = i14 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i15);
                dataInputStream.readFully(bArrCopyOf, i14, iMin);
                iMin = Math.min(i13 - i15, 10485760);
                i14 = i15;
            }
            map.put(utf, bArrCopyOf);
        }
        return new w7.f(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(w7.f fVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setH = fVar.h();
        dataOutputStream.writeInt(setH.size());
        for (Map.Entry<String, byte[]> entry : setH) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void d(String str, w7.e eVar) {
        e eVarK = k(str);
        if (eVarK.b(eVar)) {
            this.f9224e.c(eVarK);
        }
    }

    public int e(String str) {
        return k(str).f9213a;
    }

    public e f(String str) {
        return this.f9220a.get(str);
    }

    public Collection<e> g() {
        return Collections.unmodifiableCollection(this.f9220a.values());
    }

    public w7.d h(String str) {
        e eVarF = f(str);
        return eVarF != null ? eVarF.c() : w7.f.f121100c;
    }

    public String i(int i11) {
        return this.f9221b.get(i11);
    }

    public e k(String str) {
        e eVar = this.f9220a.get(str);
        return eVar == null ? c(str) : eVar;
    }

    public void l(long j11) {
        c cVar;
        this.f9224e.a(j11);
        c cVar2 = this.f9225f;
        if (cVar2 != null) {
            cVar2.a(j11);
        }
        if (this.f9224e.d() || (cVar = this.f9225f) == null || !cVar.d()) {
            this.f9224e.g(this.f9220a, this.f9221b);
        } else {
            this.f9225f.g(this.f9220a, this.f9221b);
            this.f9224e.b(this.f9220a);
        }
        c cVar3 = this.f9225f;
        if (cVar3 != null) {
            cVar3.h();
            this.f9225f = null;
        }
    }

    public void n(String str) {
        e eVar = this.f9220a.get(str);
        if (eVar != null && eVar.f() && eVar.h()) {
            this.f9220a.remove(str);
            int i11 = eVar.f9213a;
            boolean z11 = this.f9223d.get(i11);
            this.f9224e.f(eVar, z11);
            if (z11) {
                this.f9221b.remove(i11);
                this.f9223d.delete(i11);
            } else {
                this.f9221b.put(i11, null);
                this.f9222c.put(i11, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void p() {
        d1 it = b0.m(this.f9220a.keySet()).iterator();
        while (it.hasNext()) {
            n((String) it.next());
        }
    }

    public void q() {
        this.f9224e.e(this.f9220a);
        int size = this.f9222c.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f9221b.remove(this.f9222c.keyAt(i11));
        }
        this.f9222c.clear();
        this.f9223d.clear();
    }
}
