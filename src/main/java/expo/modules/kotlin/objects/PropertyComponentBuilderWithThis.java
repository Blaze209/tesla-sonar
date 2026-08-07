package expo.modules.kotlin.objects;

import co0.q;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\t\u0018\u00012\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ=\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "ThisType", "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Lco0/q;", "thisType", "", "name", "<init>", "(Lco0/q;Ljava/lang/String;)V", "R", "Lkotlin/Function1;", "body", "get", "(Lwn0/l;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "T", "Lkotlin/Function2;", "Ljn0/h0;", "set", "(Lwn0/p;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;", "Lco0/q;", "getThisType", "()Lco0/q;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PropertyComponentBuilderWithThis<ThisType> extends PropertyComponentBuilder {
    private final q thisType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyComponentBuilderWithThis(q thisType, String name) {
        super(name);
        s.k(thisType, "thisType");
        s.k(name, "name");
        this.thisType = thisType;
    }

    public final /* synthetic */ <R> PropertyComponentBuilderWithThis<ThisType> get(l<? super ThisType, ? extends R> body) {
        s.k(body, "body");
        AnyType[] anyTypeArr = {new AnyType(getThisType(), null, 2, null)};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(4, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(4, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(4, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilderWithThis$get$1$1(body));
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setGetter(syncFunctionComponent);
        return this;
    }

    public final q getThisType() {
        return this.thisType;
    }

    public final /* synthetic */ <T> PropertyComponentBuilderWithThis<ThisType> set(final p<? super ThisType, ? super T, h0> body) {
        s.k(body, "body");
        AnyType anyType = new AnyType(getThisType(), null, 2, null);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType2 == null) {
            s.p();
            s.p();
            PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1 propertyComponentBuilderWithThis$set$$inlined$apply$lambda$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "T");
                    return null;
                }
            };
            s.q(4, "T");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "T");
            anyType2 = new AnyType(new LazyKType(dVarB2, false, propertyComponentBuilderWithThis$set$$inlined$apply$lambda$1), null);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(h0.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(h0.class));
            returnTypeProvider.getTypes().put(o0.b(h0.class), returnType);
        }
        s.p();
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent("set", anyTypeArr, returnType, new l<Object[], h0>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilderWithThis$set$1$1
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] it) {
                s.k(it, "it");
                p<ThisType, T, h0> pVar = body;
                Object obj = it[0];
                Object obj2 = it[1];
                s.q(1, "T");
                pVar.invoke((ThisType) obj, (T) obj2);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr) {
                invoke2(objArr);
                return h0.f84049a;
            }
        });
        syncFunctionComponent.setOwnerType(getThisType());
        syncFunctionComponent.setCanTakeOwner(true);
        setSetter(syncFunctionComponent);
        return this;
    }
}
