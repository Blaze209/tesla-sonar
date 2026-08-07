package p013kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import bo0.n;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import p013kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
public class JvmNameResolverBase implements NameResolver {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f88156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<String> f88157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map<String, Integer> f88158f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f88159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Integer> f88160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<JvmProtoBuf.StringTableTypes.Record> f88161c;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JvmProtoBuf.StringTableTypes.Record.Operation.values().length];
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JvmProtoBuf.StringTableTypes.Record.Operation.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        String strY0 = v.y0(v.p('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f88156d = strY0;
        List<String> listP = v.p(strY0 + "/Any", strY0 + "/Nothing", strY0 + "/Unit", strY0 + "/Throwable", strY0 + "/Number", strY0 + "/Byte", strY0 + "/Double", strY0 + "/Float", strY0 + "/Int", strY0 + "/Long", strY0 + "/Short", strY0 + "/Boolean", strY0 + "/Char", strY0 + "/CharSequence", strY0 + "/String", strY0 + "/Comparable", strY0 + "/Enum", strY0 + "/Array", strY0 + "/ByteArray", strY0 + "/DoubleArray", strY0 + "/FloatArray", strY0 + "/IntArray", strY0 + "/LongArray", strY0 + "/ShortArray", strY0 + "/BooleanArray", strY0 + "/CharArray", strY0 + "/Cloneable", strY0 + "/Annotation", strY0 + "/collections/Iterable", strY0 + "/collections/MutableIterable", strY0 + "/collections/Collection", strY0 + "/collections/MutableCollection", strY0 + "/collections/List", strY0 + "/collections/MutableList", strY0 + "/collections/Set", strY0 + "/collections/MutableSet", strY0 + "/collections/Map", strY0 + "/collections/MutableMap", strY0 + "/collections/Map.Entry", strY0 + "/collections/MutableMap.MutableEntry", strY0 + "/collections/Iterator", strY0 + "/collections/MutableIterator", strY0 + "/collections/ListIterator", strY0 + "/collections/MutableListIterator");
        f88157e = listP;
        Iterable<IndexedValue> iterableT1 = v.t1(listP);
        LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(iterableT1, 10)), 16));
        for (IndexedValue indexedValue : iterableT1) {
            linkedHashMap.put((String) indexedValue.d(), Integer.valueOf(indexedValue.c()));
        }
        f88158f = linkedHashMap;
    }

    public JvmNameResolverBase(String[] strings, Set<Integer> localNameIndices, List<JvmProtoBuf.StringTableTypes.Record> records) {
        s.k(strings, "strings");
        s.k(localNameIndices, "localNameIndices");
        s.k(records, "records");
        this.f88159a = strings;
        this.f88160b = localNameIndices;
        this.f88161c = records;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getQualifiedClassName(int i11) {
        return getString(i11);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0035  */
    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public String getString(int i11) {
        String strSubstring;
        JvmProtoBuf.StringTableTypes.Record record = this.f88161c.get(i11);
        if (record.hasString()) {
            strSubstring = record.getString();
        } else if (record.hasPredefinedIndex()) {
            List<String> list = f88157e;
            int size = list.size();
            int predefinedIndex = record.getPredefinedIndex();
            if (predefinedIndex < 0 || predefinedIndex >= size) {
                strSubstring = this.f88159a[i11];
            } else {
                strSubstring = list.get(record.getPredefinedIndex());
            }
        } else {
            strSubstring = this.f88159a[i11];
        }
        if (record.getSubstringIndexCount() >= 2) {
            List<Integer> substringIndexList = record.getSubstringIndexList();
            s.h(substringIndexList);
            Integer num = substringIndexList.get(0);
            Integer num2 = substringIndexList.get(1);
            if (num.intValue() >= 0 && num.intValue() <= num2.intValue() && num2.intValue() <= strSubstring.length()) {
                s.h(strSubstring);
                s.h(num);
                int iIntValue = num.intValue();
                s.h(num2);
                strSubstring = strSubstring.substring(iIntValue, num2.intValue());
                s.j(strSubstring, "substring(...)");
            }
        }
        String strU = strSubstring;
        if (record.getReplaceCharCount() >= 2) {
            List<Integer> replaceCharList = record.getReplaceCharList();
            s.h(replaceCharList);
            Integer num3 = replaceCharList.get(0);
            Integer num4 = replaceCharList.get(1);
            s.h(strU);
            strU = t.U(strU, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        String strU2 = strU;
        JvmProtoBuf.StringTableTypes.Record.Operation operation = record.getOperation();
        if (operation == null) {
            operation = JvmProtoBuf.StringTableTypes.Record.Operation.NONE;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[operation.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                s.h(strU2);
                strU2 = t.U(strU2, CoreConstants.DOLLAR, CoreConstants.DOT, false, 4, null);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (strU2.length() >= 2) {
                    s.h(strU2);
                    strU2 = strU2.substring(1, strU2.length() - 1);
                    s.j(strU2, "substring(...)");
                }
                String str = strU2;
                s.h(str);
                strU2 = t.U(str, CoreConstants.DOLLAR, CoreConstants.DOT, false, 4, null);
            }
        }
        s.h(strU2);
        return strU2;
    }

    @Override // p013kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return this.f88160b.contains(Integer.valueOf(i11));
    }
}
