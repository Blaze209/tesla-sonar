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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u000e\b\u0004\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000e\u001a\u00020\u0000\"\u0006\b\u0000\u0010\u000b\u0018\u00012\u0014\b\u0004\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "R", "Lkotlin/Function0;", "body", "get", "(Lwn0/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "T", "Lkotlin/Function1;", "Ljn0/h0;", "set", "(Lwn0/l;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;", "Lexpo/modules/kotlin/objects/PropertyComponent;", "build", "()Lexpo/modules/kotlin/objects/PropertyComponent;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getter", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getGetter", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "setGetter", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "setter", "getSetter", "setSetter", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class PropertyComponentBuilder {
    private SyncFunctionComponent getter;
    private final String name;
    private SyncFunctionComponent setter;

    public PropertyComponentBuilder(String name) {
        s.k(name, "name");
        this.name = name;
    }

    public final PropertyComponent build() {
        return new PropertyComponent(this.name, this.getter, this.setter);
    }

    public final /* synthetic */ <R> PropertyComponentBuilder get(wn0.a<? extends R> body) {
        s.k(body, "body");
        AnyType[] anyTypeArr = new AnyType[0];
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
        setGetter(new SyncFunctionComponent("get", anyTypeArr, returnType, new PropertyComponentBuilder$get$1$1(body)));
        return this;
    }

    public final SyncFunctionComponent getGetter() {
        return this.getter;
    }

    public final String getName() {
        return this.name;
    }

    public final SyncFunctionComponent getSetter() {
        return this.setter;
    }

    public final /* synthetic */ <T> PropertyComponentBuilder set(final l<? super T, h0> body) {
        s.k(body, "body");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "T");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "T");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            s.p();
            PropertyComponentBuilder$set$$inlined$apply$lambda$1 propertyComponentBuilder$set$$inlined$apply$lambda$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilder$set$$inlined$apply$lambda$1
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
            anyType = new AnyType(new LazyKType(dVarB2, false, propertyComponentBuilder$set$$inlined$apply$lambda$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(h0.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(h0.class));
            returnTypeProvider.getTypes().put(o0.b(h0.class), returnType);
        }
        s.p();
        setSetter(new SyncFunctionComponent("set", anyTypeArr, returnType, new l<Object[], h0>() { // from class: expo.modules.kotlin.objects.PropertyComponentBuilder$set$1$1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr) {
                invoke2(objArr);
                return h0.f84049a;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object[] it) {
                s.k(it, "it");
                l<T, h0> lVar = body;
                Object obj = it[0];
                s.q(1, "T");
                lVar.invoke((T) obj);
            }
        }));
        return this;
    }

    public final void setGetter(SyncFunctionComponent syncFunctionComponent) {
        this.getter = syncFunctionComponent;
    }

    public final void setSetter(SyncFunctionComponent syncFunctionComponent) {
        this.setter = syncFunctionComponent;
    }
}
