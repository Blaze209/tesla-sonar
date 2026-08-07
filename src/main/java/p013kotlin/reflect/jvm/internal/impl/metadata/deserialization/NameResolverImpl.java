package p013kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import jn0.w;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: loaded from: classes9.dex */
public final class NameResolverImpl implements NameResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProtoBuf.StringTable f88073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ProtoBuf.QualifiedNameTable f88074b;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameResolverImpl(ProtoBuf.StringTable strings, ProtoBuf.QualifiedNameTable qualifiedNames) {
        s.k(strings, "strings");
        s.k(qualifiedNames, "qualifiedNames");
        this.f88073a = strings;
        this.f88074b = qualifiedNames;
    }

    private final w<List<String>, List<String>, Boolean> a(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.f88074b.getQualifiedName(i11);
            String string = this.f88073a.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            s.h(kind);
            int i12 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i12 == 1) {
                linkedList2.addFirst(string);
            } else if (i12 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(string);
                z11 = true;
            }
            i11 = qualifiedName.getParentQualifiedName();
        }
        return new w<>(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i11) {
        w<List<String>, List<String>, Boolean> wVarA = a(i11);
        List<String> listA = wVarA.a();
        String strY0 = v.y0(wVarA.b(), ".", null, null, 0, null, null, 62, null);
        if (listA.isEmpty()) {
            return strY0;
        }
        return v.y0(listA, "/", null, null, 0, null, null, 62, null) + '/' + strY0;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i11) {
        String string = this.f88073a.getString(i11);
        s.j(string, "getString(...)");
        return string;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return a(i11).f().booleanValue();
    }
}
