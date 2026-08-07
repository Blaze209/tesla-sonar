package p013kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.x;
import p013kotlin.Pair;
import p013kotlin.collections.IndexedValue;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import p013kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import p013kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import wn0.l;

/* JADX INFO: loaded from: classes9.dex */
final class SignatureEnhancementBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, PredefinedFunctionEnhancementInfo> f87446a = new LinkedHashMap();

    public final Map<String, PredefinedFunctionEnhancementInfo> b() {
        return this.f87446a;
    }

    public final class ClassEnhancementBuilder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f87447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SignatureEnhancementBuilder f87448b;

        public ClassEnhancementBuilder(SignatureEnhancementBuilder signatureEnhancementBuilder, String className) {
            s.k(className, "className");
            this.f87448b = signatureEnhancementBuilder;
            this.f87447a = className;
        }

        public static /* synthetic */ void function$default(ClassEnhancementBuilder classEnhancementBuilder, String str, String str2, l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            classEnhancementBuilder.function(str, str2, lVar);
        }

        public final void function(String name, String str, l<? super FunctionEnhancementBuilder, h0> block) {
            s.k(name, "name");
            s.k(block, "block");
            Map map = this.f87448b.f87446a;
            FunctionEnhancementBuilder functionEnhancementBuilder = new FunctionEnhancementBuilder(this, name, str);
            block.invoke(functionEnhancementBuilder);
            Pair<String, PredefinedFunctionEnhancementInfo> pairBuild = functionEnhancementBuilder.build();
            map.put(pairBuild.e(), pairBuild.f());
        }

        public final String getClassName() {
            return this.f87447a;
        }

        public final class FunctionEnhancementBuilder {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f87449a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f87450b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List<Pair<String, TypeEnhancementInfo>> f87451c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Pair<String, TypeEnhancementInfo> f87452d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ClassEnhancementBuilder f87453e;

            public FunctionEnhancementBuilder(ClassEnhancementBuilder classEnhancementBuilder, String functionName, String str) {
                s.k(functionName, "functionName");
                this.f87453e = classEnhancementBuilder;
                this.f87449a = functionName;
                this.f87450b = str;
                this.f87451c = new ArrayList();
                this.f87452d = x.a("V", null);
            }

            public final Pair<String, PredefinedFunctionEnhancementInfo> build() {
                SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
                String className = this.f87453e.getClassName();
                String str = this.f87449a;
                List<Pair<String, TypeEnhancementInfo>> list = this.f87451c;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).e());
                }
                String strSignature = signatureBuildingComponents.signature(className, signatureBuildingComponents.jvmDescriptor(str, arrayList, this.f87452d.e()));
                TypeEnhancementInfo typeEnhancementInfoF = this.f87452d.f();
                List<Pair<String, TypeEnhancementInfo>> list2 = this.f87451c;
                ArrayList arrayList2 = new ArrayList(v.y(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((TypeEnhancementInfo) ((Pair) it2.next()).f());
                }
                return x.a(strSignature, new PredefinedFunctionEnhancementInfo(typeEnhancementInfoF, arrayList2, this.f87450b));
            }

            public final void parameter(String type, JavaTypeQualifiers... qualifiers) {
                TypeEnhancementInfo typeEnhancementInfo;
                s.k(type, "type");
                s.k(qualifiers, "qualifiers");
                List<Pair<String, TypeEnhancementInfo>> list = this.f87451c;
                if (qualifiers.length == 0) {
                    typeEnhancementInfo = null;
                } else {
                    Iterable<IndexedValue> iterableK1 = n.K1(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(iterableK1, 10)), 16));
                    for (IndexedValue indexedValue : iterableK1) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (JavaTypeQualifiers) indexedValue.d());
                    }
                    typeEnhancementInfo = new TypeEnhancementInfo(linkedHashMap);
                }
                list.add(x.a(type, typeEnhancementInfo));
            }

            public final void returns(String type, JavaTypeQualifiers... qualifiers) {
                s.k(type, "type");
                s.k(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableK1 = n.K1(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(bo0.n.f(v0.e(v.y(iterableK1, 10)), 16));
                for (IndexedValue indexedValue : iterableK1) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (JavaTypeQualifiers) indexedValue.d());
                }
                this.f87452d = x.a(type, new TypeEnhancementInfo(linkedHashMap));
            }

            public final void returns(JvmPrimitiveType type) {
                s.k(type, "type");
                String desc = type.getDesc();
                s.j(desc, "getDesc(...)");
                this.f87452d = x.a(desc, null);
            }
        }
    }
}
