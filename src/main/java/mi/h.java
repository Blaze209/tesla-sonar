package mi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.apollographql.apollo3.exception.JsonDataException;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\b\u0018\u0000 X2\u00020\u0001:\u0001;B/\b\u0007\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0017J\u0011\u0010#\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\u0010J\u001d\u00106\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0010J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b9\u0010:R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR,\u0010L\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010M0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010W\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lmi/h;", "Lmi/f;", "", "", "", "root", "", "pathRoot", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "any", "Lmi/f$a;", "n", "(Ljava/lang/Object;)Lmi/f$a;", "Ljn0/h0;", "c", "()V", "needle", "haystack", "", "C", "(Ljava/lang/String;Ljava/util/List;)I", "H", "()Ljava/lang/String;", "o", "()Lmi/h;", "t", "p", "B", "", "hasNext", "()Z", "peek", "()Lmi/f$a;", "L", Gender.OTHER, "nextBoolean", "", "i1", "()Ljava/lang/Void;", "", "nextDouble", "()D", "nextInt", "()I", "", "nextLong", "()J", "Lmi/e;", "x1", "()Lmi/e;", Gender.FEMALE, "close", "names", "A3", "(Ljava/util/List;)I", "m", "getPath", "()Ljava/util/List;", "a", "Ljava/util/Map;", "getRoot", "()Ljava/util/Map;", "b", "Ljava/util/List;", "Lmi/f$a;", "peekedToken", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "peekedData", "", "e", "[Ljava/lang/Object;", "path", "f", "[Ljava/util/Map;", "containerStack", "", "g", "[Ljava/util/Iterator;", "iteratorStack", "", "h", "[I", "nameIndexStack", IntegerTokenConverter.CONVERTER_KEY, "I", "stackSize", "j", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<Object> pathRoot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private f.a peekedToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Object peekedData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object[] path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object>[] containerStack;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Iterator<?>[] iteratorStack;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int[] nameIndexStack;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int stackSize;

    /* JADX INFO: renamed from: mi.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lmi/h$a;", "", "<init>", "()V", "Lmi/f;", "Lmi/h;", "a", "(Lmi/f;)Lmi/h;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(f fVar) {
            s.k(fVar, "<this>");
            if (fVar instanceof h) {
                return (h) fVar;
            }
            f.a peekedToken = fVar.getPeekedToken();
            if (peekedToken == f.a.BEGIN_OBJECT) {
                List<Object> path = fVar.getPath();
                Object objD = a.d(fVar);
                s.i(objD, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return new h((Map) objD, path);
            }
            throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + peekedToken + "` json token").toString());
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92143a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.END_OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f92143a = iArr;
        }
    }

    public h(Map<String, ? extends Object> root, List<? extends Object> pathRoot) {
        s.k(root, "root");
        s.k(pathRoot, "pathRoot");
        this.root = root;
        this.pathRoot = pathRoot;
        this.path = new Object[256];
        this.containerStack = new Map[256];
        this.iteratorStack = new Iterator[256];
        this.nameIndexStack = new int[256];
        this.peekedToken = f.a.BEGIN_OBJECT;
        this.peekedData = root;
    }

    private final int C(String needle, List<String> haystack) {
        int i11 = this.nameIndexStack[this.stackSize - 1];
        if (i11 >= haystack.size() || !s.f(haystack.get(i11), needle)) {
            int iIndexOf = haystack.indexOf(needle);
            if (iIndexOf != -1) {
                this.nameIndexStack[this.stackSize - 1] = iIndexOf + 1;
            }
            return iIndexOf;
        }
        int[] iArr = this.nameIndexStack;
        int i12 = this.stackSize;
        iArr[i12 - 1] = iArr[i12 - 1] + 1;
        return i11;
    }

    private final String H() {
        return v.y0(getPath(), ".", null, null, 0, null, null, 62, null);
    }

    private final void c() {
        int i11 = this.stackSize;
        if (i11 == 0) {
            this.peekedToken = f.a.END_DOCUMENT;
            return;
        }
        Iterator<?> it = this.iteratorStack[i11 - 1];
        s.h(it);
        Object[] objArr = this.path;
        int i12 = this.stackSize;
        if (objArr[i12 - 1] instanceof Integer) {
            int i13 = i12 - 1;
            Object obj = objArr[i12 - 1];
            s.i(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i13] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (!it.hasNext()) {
            this.peekedToken = this.path[this.stackSize + (-1)] instanceof Integer ? f.a.END_ARRAY : f.a.END_OBJECT;
            return;
        }
        Object next = it.next();
        this.peekedData = next;
        this.peekedToken = next instanceof Map.Entry ? f.a.NAME : n(next);
    }

    private final f.a n(Object any) {
        if (any == null) {
            return f.a.NULL;
        }
        if (any instanceof List) {
            return f.a.BEGIN_ARRAY;
        }
        if (any instanceof Map) {
            return f.a.BEGIN_OBJECT;
        }
        if (any instanceof Integer) {
            return f.a.NUMBER;
        }
        if (any instanceof Long) {
            return f.a.LONG;
        }
        if (any instanceof Double) {
            return f.a.NUMBER;
        }
        if (any instanceof e) {
            return f.a.NUMBER;
        }
        if (any instanceof String) {
            return f.a.STRING;
        }
        return any instanceof Boolean ? f.a.BOOLEAN : f.a.ANY;
    }

    @Override // mi.f
    public int A3(List<String> names) {
        s.k(names, "names");
        while (hasNext()) {
            int iC = C(L(), names);
            if (iC != -1) {
                return iC;
            }
            F();
        }
        return -1;
    }

    @Override // mi.f
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public h j() {
        int i11 = this.stackSize - 1;
        this.stackSize = i11;
        this.iteratorStack[i11] = null;
        this.path[i11] = null;
        this.containerStack[i11] = null;
        c();
        return this;
    }

    @Override // mi.f
    public void F() {
        c();
    }

    @Override // mi.f
    public String L() {
        if (getPeekedToken() != f.a.NAME) {
            throw new JsonDataException("Expected NAME but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
        Map.Entry entry = (Map.Entry) obj;
        this.path[this.stackSize - 1] = entry.getKey();
        this.peekedData = entry.getValue();
        this.peekedToken = n(entry.getValue());
        return (String) entry.getKey();
    }

    @Override // mi.f
    public String O() {
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            Object obj = this.peekedData;
            s.h(obj);
            String string = obj.toString();
            c();
            return string;
        }
        throw new JsonDataException("Expected a String but was " + getPeekedToken() + " at path " + H());
    }

    @Override // mi.f
    public List<Object> getPath() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.pathRoot);
        int i11 = this.stackSize;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = this.path[i12];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // mi.f
    public boolean hasNext() {
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        return (i11 == 1 || i11 == 2) ? false : true;
    }

    @Override // mi.f
    public Void i1() {
        if (getPeekedToken() == f.a.NULL) {
            c();
            return null;
        }
        throw new JsonDataException("Expected NULL but was " + getPeekedToken() + " at path " + H());
    }

    @Override // mi.f
    public void m() {
        Map<String, Object>[] mapArr = this.containerStack;
        int i11 = this.stackSize;
        Map<String, Object> map = mapArr[i11 - 1];
        this.path[i11 - 1] = null;
        s.h(map);
        this.iteratorStack[i11 - 1] = map.entrySet().iterator();
        this.nameIndexStack[this.stackSize - 1] = 0;
        c();
    }

    @Override // mi.f
    public boolean nextBoolean() {
        if (getPeekedToken() == f.a.BOOLEAN) {
            Object obj = this.peekedData;
            s.i(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Boolean bool = (Boolean) obj;
            bool.getClass();
            c();
            return bool.booleanValue();
        }
        throw new JsonDataException("Expected BOOLEAN but was " + getPeekedToken() + " at path " + H());
    }

    @Override // mi.f
    public double nextDouble() {
        double dDoubleValue;
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new JsonDataException("Expected a Double but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            dDoubleValue = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            dDoubleValue = ni.c.c(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            dDoubleValue = Double.parseDouble((String) obj);
        } else {
            if (!(obj instanceof e)) {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            dDoubleValue = Double.parseDouble(((e) obj).getValue());
        }
        c();
        return dDoubleValue;
    }

    @Override // mi.f
    public int nextInt() {
        int iA;
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new JsonDataException("Expected an Int but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            iA = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            iA = ni.c.d(((Number) obj).longValue());
        } else if (obj instanceof Double) {
            iA = ni.c.a(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            iA = Integer.parseInt((String) obj);
        } else {
            if (!(obj instanceof e)) {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            iA = Integer.parseInt(((e) obj).getValue());
        }
        c();
        return iA;
    }

    @Override // mi.f
    public long nextLong() {
        long jB;
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new JsonDataException("Expected a Long but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer) {
            jB = ((Number) obj).intValue();
        } else if (obj instanceof Long) {
            jB = ((Number) obj).longValue();
        } else if (obj instanceof Double) {
            jB = ni.c.b(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            jB = Long.parseLong((String) obj);
        } else {
            if (!(obj instanceof e)) {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            jB = Long.parseLong(((e) obj).getValue());
        }
        c();
        return jB;
    }

    @Override // mi.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public h f() {
        if (getPeekedToken() != f.a.BEGIN_ARRAY) {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        s.i(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        int i11 = this.stackSize;
        if (i11 >= 256) {
            throw new IllegalStateException("Nesting too deep");
        }
        this.stackSize = i11 + 1;
        this.path[i11] = -1;
        this.iteratorStack[this.stackSize - 1] = list.iterator();
        c();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mi.f
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public h h() {
        if (getPeekedToken() != f.a.BEGIN_OBJECT) {
            throw new JsonDataException("Expected BEGIN_OBJECT but was " + getPeekedToken() + " at path " + H());
        }
        int i11 = this.stackSize;
        if (i11 >= 256) {
            throw new IllegalStateException("Nesting too deep");
        }
        this.stackSize = i11 + 1;
        Map<String, Object>[] mapArr = this.containerStack;
        Object obj = this.peekedData;
        s.i(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        mapArr[i11] = obj;
        m();
        return this;
    }

    @Override // mi.f
    /* JADX INFO: renamed from: peek, reason: from getter */
    public f.a getPeekedToken() {
        return this.peekedToken;
    }

    @Override // mi.f
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public h e() {
        if (getPeekedToken() == f.a.END_ARRAY) {
            int i11 = this.stackSize - 1;
            this.stackSize = i11;
            this.iteratorStack[i11] = null;
            this.path[i11] = null;
            c();
            return this;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + getPeekedToken() + " at path " + H());
    }

    @Override // mi.f
    public e x1() {
        e eVar;
        int i11 = b.f92143a[getPeekedToken().ordinal()];
        if (i11 != 3 && i11 != 4 && i11 != 5) {
            throw new JsonDataException("Expected a Number but was " + getPeekedToken() + " at path " + H());
        }
        Object obj = this.peekedData;
        if (obj instanceof Integer ? true : obj instanceof Long ? true : obj instanceof Double) {
            eVar = new e(obj.toString());
        } else if (obj instanceof String) {
            eVar = new e((String) obj);
        } else {
            if (!(obj instanceof e)) {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            eVar = (e) obj;
        }
        c();
        return eVar;
    }

    public /* synthetic */ h(Map map, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i11 & 2) != 0 ? v.m() : list);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
