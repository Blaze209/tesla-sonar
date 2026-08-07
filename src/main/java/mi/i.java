package mi;

import bo0.j;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Gender;
import ii.a0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.d1;
import p013kotlin.collections.s0;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010\u0003R\u0018\u00100\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000205048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lmi/i;", "Lmi/g;", "<init>", "()V", "", "other", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "T", "value", "(Ljava/lang/Object;)Lmi/i;", "o", "()Ljava/lang/Object;", "f", "()Lmi/g;", "e", "h", "j", "", "name", Gender.NONE, "(Ljava/lang/String;)Lmi/g;", "H", "(Ljava/lang/String;)Lmi/i;", "", "J", "(Z)Lmi/i;", "", "p", "(D)Lmi/i;", "", "t", "(I)Lmi/i;", "", "B", "(J)Lmi/i;", "Lmi/e;", "I", "(Lmi/e;)Lmi/i;", "Lii/a0;", "C", "(Lii/a0;)Lmi/i;", "n", "()Lmi/i;", "Ljn0/h0;", "close", "a", "Ljava/lang/Object;", "root", "b", "Z", "rootSet", "", "Lmi/i$a;", "Ljava/util/List;", "stack", "getPath", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Object root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean rootSet;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<a> stack = new ArrayList();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lmi/i$a;", "", "<init>", "()V", "a", "b", "Lmi/i$a$a;", "Lmi/i$a$b;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: mi.i$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"Lmi/i$a$a;", "Lmi/i$a;", "", "", "list", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class C1969a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final List<Object> list;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1969a(List<Object> list) {
                super(null);
                s.k(list, "list");
                this.list = list;
            }

            public final List<Object> a() {
                return this.list;
            }

            public String toString() {
                return "List (" + this.list.size() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lmi/i$a$b;", "Lmi/i$a;", "", "", "", "map", "name", "<init>", "(Ljava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Map<String, Object> map;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private String name;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Map<String, Object> map, String str) {
                super(null);
                s.k(map, "map");
                this.map = map;
                this.name = str;
            }

            public final Map<String, Object> a() {
                return this.map;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getName() {
                return this.name;
            }

            public final void c(String str) {
                this.name = str;
            }

            public String toString() {
                return "Map (" + this.name + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final <T> i T(T value) {
        a aVar = (a) v.C0(this.stack);
        if (!(aVar instanceof a.b)) {
            if (aVar instanceof a.C1969a) {
                ((a.C1969a) aVar).a().add(value);
                return this;
            }
            this.root = value;
            this.rootSet = true;
            return this;
        }
        a.b bVar = (a.b) aVar;
        String name = bVar.getName();
        if (name == null) {
            throw new IllegalStateException("Check failed.");
        }
        if (bVar.a().containsKey(name)) {
            bVar.a().put(name, c(bVar.a().get(name), value));
        } else {
            bVar.a().put(name, value);
        }
        bVar.c(null);
        return this;
    }

    private final Object c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj2 != null) {
            if (obj instanceof List) {
                if (!(obj2 instanceof List)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list.size() != list2.size()) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                j jVarN = v.n((Collection) obj);
                ArrayList arrayList = new ArrayList(v.y(jVarN, 10));
                Iterator<Integer> it = jVarN.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((s0) it).nextInt();
                    arrayList.add(c(list.get(iNextInt), list2.get(iNextInt)));
                }
                return arrayList;
            }
            if (obj instanceof Map) {
                if (!(obj2 instanceof Map)) {
                    throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
                }
                Map map = (Map) obj;
                Map map2 = (Map) obj2;
                Set<String> setN = d1.n(map.keySet(), map2.keySet());
                ArrayList arrayList2 = new ArrayList(v.y(setN, 10));
                for (String str : setN) {
                    arrayList2.add(x.a(str, c(map.get(str), map2.get(str))));
                }
                return v0.y(arrayList2);
            }
            if (!s.f(obj, obj2)) {
                throw new IllegalStateException(("Cannot merge " + obj + " with " + obj2).toString());
            }
        }
        return obj;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public i D(long value) {
        return T(Long.valueOf(value));
    }

    @Override // mi.g
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public i v2(a0 value) {
        s.k(value, "value");
        return T(null);
    }

    @Override // mi.g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public i w(String value) {
        s.k(value, "value");
        return T(value);
    }

    @Override // mi.g
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public i U1(e value) {
        s.k(value, "value");
        return T(value);
    }

    @Override // mi.g
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public i K(boolean value) {
        return T(Boolean.valueOf(value));
    }

    @Override // mi.g
    public g N(String name) {
        s.k(name, "name");
        a aVar = (a) v.A0(this.stack);
        if (!(aVar instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        a.b bVar = (a.b) aVar;
        if (bVar.getName() != null) {
            throw new IllegalStateException("Check failed.");
        }
        bVar.c(name);
        return this;
    }

    @Override // mi.g
    public g e() {
        List<a> list = this.stack;
        a aVarRemove = list.remove(list.size() - 1);
        if (!(aVarRemove instanceof a.C1969a)) {
            throw new IllegalStateException("Check failed.");
        }
        T(((a.C1969a) aVarRemove).a());
        return this;
    }

    @Override // mi.g
    public g f() {
        this.stack.add(new a.C1969a(new ArrayList()));
        return this;
    }

    @Override // mi.g
    public String getPath() {
        String name;
        List<a> list = this.stack;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        for (a aVar : list) {
            if (aVar instanceof a.C1969a) {
                name = String.valueOf(((a.C1969a) aVar).a().size());
            } else {
                if (!(aVar instanceof a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                name = ((a.b) aVar).getName();
                if (name == null) {
                    name = CallerData.NA;
                }
            }
            arrayList.add(name);
        }
        return v.y0(arrayList, ".", null, null, 0, null, null, 62, null);
    }

    @Override // mi.g
    public g h() {
        this.stack.add(new a.b(new LinkedHashMap(), null));
        return this;
    }

    @Override // mi.g
    public g j() {
        List<a> list = this.stack;
        a aVarRemove = list.remove(list.size() - 1);
        if (!(aVarRemove instanceof a.b)) {
            throw new IllegalStateException("Check failed.");
        }
        T(((a.b) aVarRemove).a());
        return this;
    }

    @Override // mi.g
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public i R() {
        return T(null);
    }

    public final Object o() {
        if (this.rootSet) {
            return this.root;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // mi.g
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public i E(double value) {
        return T(Double.valueOf(value));
    }

    @Override // mi.g
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public i S1(int value) {
        return T(Integer.valueOf(value));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
