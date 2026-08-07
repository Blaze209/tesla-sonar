package ta;

import android.database.Cursor;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import za.f;
import za.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0003\u000b\u000f\rB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0015\u001a\u00020\u00138\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0001\u0002\u001a\u001b¨\u0006\u001c"}, d2 = {"Lta/e;", "Lya/d;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "Ljn0/h0;", "p", "()V", "a", "Lza/c;", "c", "()Lza/c;", "b", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "", "Z", "isClosed", "()Z", "o", "(Z)V", DateTokenConverter.CONVERTER_KEY, "Lta/e$b;", "Lta/e$c;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e implements ya.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final za.c db;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sql;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: ta.e$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lta/e$a;", "", "<init>", "()V", "", "sql", "", "b", "(Ljava/lang/String;)Z", "Lza/c;", "db", "Lta/e;", "a", "(Lza/c;Ljava/lang/String;)Lta/e;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean b(String sql) {
            String string = t.F1(sql).toString();
            if (string.length() < 3) {
                return false;
            }
            String strSubstring = string.substring(0, 3);
            s.j(strSubstring, "substring(...)");
            String upperCase = strSubstring.toUpperCase(Locale.ROOT);
            s.j(upperCase, "toUpperCase(...)");
            int iHashCode = upperCase.hashCode();
            if (iHashCode != 79487) {
                if (iHashCode != 81978) {
                    if (iHashCode == 85954 && upperCase.equals("WIT")) {
                        return true;
                    }
                } else if (upperCase.equals("SEL")) {
                    return true;
                }
            } else if (upperCase.equals("PRA")) {
                return true;
            }
            return false;
        }

        public final e a(za.c db2, String sql) {
            s.k(db2, "db");
            s.k(sql, "sql");
            return b(sql) ? new b(db2, sql) : new c(db2, sql);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\f\b\u0002\u0018\u0000 K2\u00020\u0001:\u0001LB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010)J\u000f\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000bH\u0016¢\u0006\u0004\b2\u0010\u000fJ\u000f\u00103\u001a\u00020\u000bH\u0016¢\u0006\u0004\b3\u0010\u000fJ\u000f\u00104\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u000fR\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010<\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lta/e$b;", "Lta/e;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "", "columnType", "index", "Ljn0/h0;", "T", "(II)V", "b0", "()V", "Landroid/database/Cursor;", "e0", "()Landroid/database/Cursor;", "c", "c0", "(Landroid/database/Cursor;I)V", "", "value", "y", "(I[B)V", "", "G", "(ID)V", "", "x", "(IJ)V", "c2", "(ILjava/lang/String;)V", "A", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "q3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "I1", "()Z", "reset", "J", "close", "", "e", "[I", "bindingTypes", "", "f", "[J", "longBindings", "", "g", "[D", "doubleBindings", "", "h", "[Ljava/lang/String;", "stringBindings", IntegerTokenConverter.CONVERTER_KEY, "[[B", "blobBindings", "j", "Landroid/database/Cursor;", "cursor", "k", "a", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int[] bindingTypes;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private long[] longBindings;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private double[] doubleBindings;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private String[] stringBindings;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private byte[][] blobBindings;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private Cursor cursor;

        /* JADX INFO: renamed from: ta.e$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"ta/e$b$b", "Lza/f;", "Lza/e;", "statement", "Ljn0/h0;", "o", "(Lza/e;)V", "", "n", "()Ljava/lang/String;", "sql", "", "c", "()I", "argCount", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C2412b implements f {
            C2412b() {
            }

            @Override // za.f
            /* JADX INFO: renamed from: c */
            public int getArgCount() {
                return b.this.bindingTypes.length;
            }

            @Override // za.f
            /* JADX INFO: renamed from: n */
            public String getQuery() {
                return b.this.getSql();
            }

            @Override // za.f
            public void o(za.e statement) {
                s.k(statement, "statement");
                int length = b.this.bindingTypes.length;
                for (int i11 = 1; i11 < length; i11++) {
                    int i12 = b.this.bindingTypes[i11];
                    if (i12 == 1) {
                        statement.x(i11, b.this.longBindings[i11]);
                    } else if (i12 == 2) {
                        statement.G(i11, b.this.doubleBindings[i11]);
                    } else if (i12 == 3) {
                        String str = b.this.stringBindings[i11];
                        s.h(str);
                        statement.R0(i11, str);
                    } else if (i12 == 4) {
                        byte[] bArr = b.this.blobBindings[i11];
                        s.h(bArr);
                        statement.y(i11, bArr);
                    } else if (i12 == 5) {
                        statement.A(i11);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(za.c db2, String sql) {
            super(db2, sql, null);
            s.k(db2, "db");
            s.k(sql, "sql");
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void T(int columnType, int index) {
            int i11 = index + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i11) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
                s.j(iArrCopyOf, "copyOf(...)");
                this.bindingTypes = iArrCopyOf;
            }
            if (columnType == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i11) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i11);
                    s.j(jArrCopyOf, "copyOf(...)");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i11) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i11);
                    s.j(dArrCopyOf, "copyOf(...)");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i11) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
                    s.j(objArrCopyOf, "copyOf(...)");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (columnType != 4) {
                return;
            }
            byte[][] bArr = this.blobBindings;
            if (bArr.length < i11) {
                Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i11);
                s.j(objArrCopyOf2, "copyOf(...)");
                this.blobBindings = (byte[][]) objArrCopyOf2;
            }
        }

        private final void b0() {
            if (this.cursor == null) {
                this.cursor = getDb().B0(new C2412b());
            }
        }

        private final void c0(Cursor c11, int index) {
            if (index < 0 || index >= c11.getColumnCount()) {
                ya.a.b(25, "column index out of range");
                throw new KotlinNothingValueException();
            }
        }

        private final Cursor e0() {
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor;
            }
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public void A(int index) {
            p();
            T(5, index);
            this.bindingTypes[index] = 5;
        }

        @Override // ya.d
        public void G(int index, double value) {
            p();
            T(2, index);
            this.bindingTypes[index] = 2;
            this.doubleBindings[index] = value;
        }

        @Override // ya.d
        public boolean I1() {
            p();
            b0();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.moveToNext();
            }
            throw new IllegalStateException("Required value was null.");
        }

        public void J() {
            p();
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // ya.d
        public void c2(int index, String value) {
            s.k(value, "value");
            p();
            T(3, index);
            this.bindingTypes[index] = 3;
            this.stringBindings[index] = value;
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() {
            if (!getIsClosed()) {
                J();
                reset();
            }
            o(true);
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            p();
            Cursor cursorE0 = e0();
            c0(cursorE0, index);
            byte[] blob = cursorE0.getBlob(index);
            s.j(blob, "getBlob(...)");
            return blob;
        }

        @Override // ya.d
        public int getColumnCount() {
            p();
            b0();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                return cursor.getColumnCount();
            }
            return 0;
        }

        @Override // ya.d
        public String getColumnName(int index) {
            p();
            b0();
            Cursor cursor = this.cursor;
            if (cursor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            c0(cursor, index);
            String columnName = cursor.getColumnName(index);
            s.j(columnName, "getColumnName(...)");
            return columnName;
        }

        @Override // ya.d
        public long getLong(int index) {
            p();
            Cursor cursorE0 = e0();
            c0(cursorE0, index);
            return cursorE0.getLong(index);
        }

        @Override // ya.d
        public boolean isNull(int index) {
            p();
            Cursor cursorE0 = e0();
            c0(cursorE0, index);
            return cursorE0.isNull(index);
        }

        @Override // ya.d
        public String q3(int index) {
            p();
            Cursor cursorE0 = e0();
            c0(cursorE0, index);
            String string = cursorE0.getString(index);
            s.j(string, "getString(...)");
            return string;
        }

        @Override // ya.d
        public void reset() {
            p();
            Cursor cursor = this.cursor;
            if (cursor != null) {
                cursor.close();
            }
            this.cursor = null;
        }

        @Override // ya.d
        public void x(int index, long value) {
            p();
            T(1, index);
            this.bindingTypes[index] = 1;
            this.longBindings[index] = value;
        }

        @Override // ya.d
        public void y(int index, byte[] value) {
            s.k(value, "value");
            p();
            T(4, index);
            this.bindingTypes[index] = 4;
            this.blobBindings[index] = value;
        }
    }

    public /* synthetic */ e(za.c cVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, str);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    protected final za.c getDb() {
        return this.db;
    }

    /* JADX INFO: renamed from: isClosed, reason: from getter */
    protected final boolean getIsClosed() {
        return this.isClosed;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    protected final String getSql() {
        return this.sql;
    }

    protected final void o(boolean z11) {
        this.isClosed = z11;
    }

    protected final void p() {
        if (this.isClosed) {
            ya.a.b(21, "statement is closed");
            throw new KotlinNothingValueException();
        }
    }

    private e(za.c cVar, String str) {
        this.db = cVar;
        this.sql = str;
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u001eJ\u000f\u0010%\u001a\u00020\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010(R\u0018\u0010.\u001a\u00060*j\u0002`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lta/e$c;", "Lta/e;", "Lza/c;", "db", "", "sql", "<init>", "(Lza/c;Ljava/lang/String;)V", "", "index", "", "value", "Ljn0/h0;", "y", "(I[B)V", "", "G", "(ID)V", "", "x", "(IJ)V", "c2", "(ILjava/lang/String;)V", "A", "(I)V", "getBlob", "(I)[B", "getLong", "(I)J", "q3", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "I1", "()Z", "reset", "()V", "close", "Lza/g;", "Landroidx/room/driver/SupportStatement;", "e", "Lza/g;", "delegate", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final g delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(za.c db2, String sql) {
            super(db2, sql, null);
            s.k(db2, "db");
            s.k(sql, "sql");
            this.delegate = db2.P2(sql);
        }

        @Override // ya.d
        public void A(int index) {
            p();
            this.delegate.A(index);
        }

        @Override // ya.d
        public void G(int index, double value) {
            p();
            this.delegate.G(index, value);
        }

        @Override // ya.d
        public boolean I1() {
            p();
            this.delegate.execute();
            return false;
        }

        @Override // ya.d
        public void c2(int index, String value) {
            s.k(value, "value");
            p();
            this.delegate.R0(index, value);
        }

        @Override // ya.d, java.lang.AutoCloseable
        public void close() throws IOException {
            this.delegate.close();
            o(true);
        }

        @Override // ya.d
        public byte[] getBlob(int index) {
            p();
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public int getColumnCount() {
            p();
            return 0;
        }

        @Override // ya.d
        public String getColumnName(int index) {
            p();
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public long getLong(int index) {
            p();
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public boolean isNull(int index) {
            p();
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public String q3(int index) {
            p();
            ya.a.b(21, "no row");
            throw new KotlinNothingValueException();
        }

        @Override // ya.d
        public void x(int index, long value) {
            p();
            this.delegate.x(index, value);
        }

        @Override // ya.d
        public void y(int index, byte[] value) {
            s.k(value, "value");
            p();
            this.delegate.y(index, value);
        }

        @Override // ya.d
        public void reset() {
        }
    }
}
