package androidx.room;

import android.annotation.SuppressLint;
import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.actions.SearchIntents;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u000b\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0019\u0010\u0006J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\u00020-8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u0010\u000eR\u001a\u00106\u001a\u0002028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u000eR\"\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010\u000eR\"\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\u000eR\u001a\u0010D\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010\u000eR$\u0010F\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bE\u0010(\u001a\u0004\b.\u0010*R\u0014\u0010I\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Landroidx/room/l0;", "Lza/f;", "Lza/e;", "", "capacity", "<init>", "(I)V", "", SearchIntents.EXTRA_QUERY, "initArgCount", "Ljn0/h0;", "C", "(Ljava/lang/String;I)V", "release", "()V", "Landroidx/room/j0;", "H", "()Landroidx/room/j0;", "statement", "o", "(Lza/e;)V", "Lya/d;", "B", "(Lya/d;)V", "index", "A", "", "value", "x", "(IJ)V", "", "G", "(ID)V", "R0", "(ILjava/lang/String;)V", "", "y", "(I[B)V", "close", "a", "I", "getCapacity", "()I", "b", "Ljava/lang/String;", "", "c", "[J", "getLongBindings$annotations", "longBindings", "", DateTokenConverter.CONVERTER_KEY, "[D", "getDoubleBindings$annotations", "doubleBindings", "", "e", "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "f", "[[B", "getBlobBindings$annotations", "blobBindings", "", "g", "[I", "getBindingTypes$annotations", "bindingTypes", "h", "argCount", "n", "()Ljava/lang/String;", "sql", IntegerTokenConverter.CONVERTER_KEY, "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"WrongConstant"})
public final class l0 implements za.f, za.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap<Integer, l0> f13731j = new TreeMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile String query;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final long[] longBindings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double[] doubleBindings;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String[] stringBindings;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final byte[][] blobBindings;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int[] bindingTypes;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int argCount;

    /* JADX INFO: renamed from: androidx.room.l0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0003R\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/room/l0$a;", "", "<init>", "()V", "Lza/f;", "supportSQLiteQuery", "Landroidx/room/l0;", "b", "(Lza/f;)Landroidx/room/l0;", "", SearchIntents.EXTRA_QUERY, "", "argumentCount", "a", "(Ljava/lang/String;I)Landroidx/room/l0;", "Ljn0/h0;", "c", ActionConst.NULL, "I", "LONG", "DOUBLE", "STRING", "BLOB", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: androidx.room.l0$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"androidx/room/l0$a$a", "Lza/e;", "", "index", "Ljn0/h0;", "A", "(I)V", "", "value", "x", "(IJ)V", "", "G", "(ID)V", "", "R0", "(ILjava/lang/String;)V", "", "y", "(I[B)V", "close", "()V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class C0229a implements za.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ l0 f13740a;

            C0229a(l0 l0Var) {
                this.f13740a = l0Var;
            }

            @Override // za.e
            public void A(int index) {
                this.f13740a.A(index);
            }

            @Override // za.e
            public void G(int index, double value) {
                this.f13740a.G(index, value);
            }

            @Override // za.e
            public void R0(int index, String value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                this.f13740a.R0(index, value);
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                this.f13740a.close();
            }

            @Override // za.e
            public void x(int index, long value) {
                this.f13740a.x(index, value);
            }

            @Override // za.e
            public void y(int index, byte[] value) {
                p013kotlin.jvm.internal.s.k(value, "value");
                this.f13740a.y(index, value);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l0 a(String query, int argumentCount) {
            p013kotlin.jvm.internal.s.k(query, "query");
            TreeMap<Integer, l0> treeMap = l0.f13731j;
            synchronized (treeMap) {
                Map.Entry<Integer, l0> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(argumentCount));
                if (entryCeilingEntry == null) {
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    l0 l0Var = new l0(argumentCount, null);
                    l0Var.C(query, argumentCount);
                    return l0Var;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                l0 value = entryCeilingEntry.getValue();
                value.C(query, argumentCount);
                p013kotlin.jvm.internal.s.h(value);
                return value;
            }
        }

        public final l0 b(za.f supportSQLiteQuery) {
            p013kotlin.jvm.internal.s.k(supportSQLiteQuery, "supportSQLiteQuery");
            l0 l0VarA = a(supportSQLiteQuery.getQuery(), supportSQLiteQuery.getArgCount());
            supportSQLiteQuery.o(new C0229a(l0VarA));
            return l0VarA;
        }

        public final void c() {
            TreeMap<Integer, l0> treeMap = l0.f13731j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            p013kotlin.jvm.internal.s.j(it, "iterator(...)");
            while (true) {
                int i11 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i11;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ l0(int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 I(l0 l0Var, ya.d it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        l0Var.B(it);
        return jn0.h0.f84049a;
    }

    public static final l0 t(String str, int i11) {
        return INSTANCE.a(str, i11);
    }

    @Override // za.e
    public void A(int index) {
        this.bindingTypes[index] = 1;
    }

    public final void B(ya.d statement) {
        p013kotlin.jvm.internal.s.k(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.bindingTypes[i11];
            if (i12 == 1) {
                statement.A(i11);
            } else if (i12 == 2) {
                statement.x(i11, this.longBindings[i11]);
            } else if (i12 == 3) {
                statement.G(i11, this.doubleBindings[i11]);
            } else if (i12 == 4) {
                String str = this.stringBindings[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.c2(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.blobBindings[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.y(i11, bArr);
            }
            if (i11 == argCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void C(String query, int initArgCount) {
        p013kotlin.jvm.internal.s.k(query, "query");
        this.query = query;
        this.argCount = initArgCount;
    }

    @Override // za.e
    public void G(int index, double value) {
        this.bindingTypes[index] = 3;
        this.doubleBindings[index] = value;
    }

    public final j0 H() {
        return new j0(getQuery(), new wn0.l() { // from class: androidx.room.k0
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return l0.I(this.f13727a, (ya.d) obj);
            }
        });
    }

    @Override // za.e
    public void R0(int index, String value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.bindingTypes[index] = 4;
        this.stringBindings[index] = value;
    }

    @Override // za.f
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getArgCount() {
        return this.argCount;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // za.f
    /* JADX INFO: renamed from: n */
    public String getQuery() {
        String str = this.query;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // za.f
    public void o(za.e statement) {
        p013kotlin.jvm.internal.s.k(statement, "statement");
        int argCount = getArgCount();
        if (1 > argCount) {
            return;
        }
        int i11 = 1;
        while (true) {
            int i12 = this.bindingTypes[i11];
            if (i12 == 1) {
                statement.A(i11);
            } else if (i12 == 2) {
                statement.x(i11, this.longBindings[i11]);
            } else if (i12 == 3) {
                statement.G(i11, this.doubleBindings[i11]);
            } else if (i12 == 4) {
                String str = this.stringBindings[i11];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.R0(i11, str);
            } else if (i12 == 5) {
                byte[] bArr = this.blobBindings[i11];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.y(i11, bArr);
            }
            if (i11 == argCount) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final void release() {
        TreeMap<Integer, l0> treeMap = f13731j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.capacity), this);
            INSTANCE.c();
            jn0.h0 h0Var = jn0.h0.f84049a;
        }
    }

    @Override // za.e
    public void x(int index, long value) {
        this.bindingTypes[index] = 2;
        this.longBindings[index] = value;
    }

    @Override // za.e
    public void y(int index, byte[] value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.bindingTypes[index] = 5;
        this.blobBindings[index] = value;
    }

    private l0(int i11) {
        this.capacity = i11;
        int i12 = i11 + 1;
        this.bindingTypes = new int[i12];
        this.longBindings = new long[i12];
        this.doubleBindings = new double[i12];
        this.stringBindings = new String[i12];
        this.blobBindings = new byte[i12][];
    }
}
