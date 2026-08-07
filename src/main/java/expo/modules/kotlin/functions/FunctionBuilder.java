package expo.modules.kotlin.functions;

import co0.q;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.r;
import wn0.t;
import wn0.u;
import wn0.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\b2\u0010\b\u0004\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\rJA\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0010JO\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001a\b\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0013J]\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022 \b\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0016Jk\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022&\b\u0004\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0019Jy\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022,\b\u0004\u0010\u0007\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001cJ\u0087\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000222\b\u0004\u0010\u0007\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u001fJ\u0095\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u0001\"\u0006\b\u0007\u0010 \u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000228\b\u0004\u0010\u0007\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000!H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\"J£\u0001\u0010\u000b\u001a\u00020\b\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\u000e\u0018\u0001\"\u0006\b\u0002\u0010\u0011\u0018\u0001\"\u0006\b\u0003\u0010\u0014\u0018\u0001\"\u0006\b\u0004\u0010\u0017\u0018\u0001\"\u0006\b\u0005\u0010\u001a\u0018\u0001\"\u0006\b\u0006\u0010\u001d\u0018\u0001\"\u0006\b\u0007\u0010 \u0018\u0001\"\u0006\b\b\u0010#\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022>\b\u0004\u0010\u0007\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\u0004\u0012\u00028\u00000$H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010%J\u000f\u0010(\u001a\u00020\bH\u0000¢\u0006\u0004\b&\u0010'R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b,\u0010-\u001a\u0004\b*\u0010+R*\u0010.\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b3\u0010-\u001a\u0004\b0\u0010'\"\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00064"}, d2 = {"Lexpo/modules/kotlin/functions/FunctionBuilder;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "Lkotlin/Function0;", "body", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "BodyWithoutArgs", "(Lwn0/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Body", "R", "(Ljava/lang/String;Lwn0/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P0", "Lkotlin/Function1;", "(Ljava/lang/String;Lwn0/l;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P1", "Lkotlin/Function2;", "(Ljava/lang/String;Lwn0/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P2", "Lkotlin/Function3;", "(Ljava/lang/String;Lwn0/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P3", "Lkotlin/Function4;", "(Ljava/lang/String;Lwn0/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P4", "Lkotlin/Function5;", "(Ljava/lang/String;Lwn0/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P5", "Lkotlin/Function6;", "(Ljava/lang/String;Lwn0/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P6", "Lkotlin/Function7;", "(Ljava/lang/String;Lwn0/u;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "P7", "Lkotlin/Function8;", "(Ljava/lang/String;Lwn0/v;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "build$expo_modules_core_release", "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "build", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "functionComponent", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "getFunctionComponent", "setFunctionComponent", "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V", "getFunctionComponent$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FunctionBuilder {
    private SyncFunctionComponent functionComponent;
    private final String name;

    public FunctionBuilder(String name) {
        s.k(name, "name");
        this.name = name;
    }

    public static /* synthetic */ void getFunctionComponent$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public final /* synthetic */ <R> SyncFunctionComponent Body(String name, final wn0.a<? extends R> body) {
        s.k(name, "name");
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.3
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final SyncFunctionComponent BodyWithoutArgs(final wn0.a<? extends Object> body) {
        s.k(body, "body");
        String name = getName();
        AnyType[] anyTypeArr = new AnyType[0];
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
        if (returnType == null) {
            returnType = new ReturnType(o0.b(Object.class));
            returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.1
            @Override // wn0.l
            public final Object invoke(Object[] it) {
                s.k(it, "it");
                return body.invoke();
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final SyncFunctionComponent build$expo_modules_core_release() {
        SyncFunctionComponent syncFunctionComponent = this.functionComponent;
        if (syncFunctionComponent != null) {
            return syncFunctionComponent;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final SyncFunctionComponent getFunctionComponent() {
        return this.functionComponent;
    }

    public final String getName() {
        return this.name;
    }

    public final void setFunctionComponent(SyncFunctionComponent syncFunctionComponent) {
        this.functionComponent = syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0> SyncFunctionComponent Body(String name, final l<? super P0, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$1 functionBuilder$Body$$inlined$toArgsArray$default$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$1), null);
        }
        AnyType[] anyTypeArr = {anyType};
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.5
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1> SyncFunctionComponent Body(String name, final p<? super P0, ? super P1, ? extends R> body) {
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$2 functionBuilder$Body$$inlined$toArgsArray$default$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$2), null);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$3 functionBuilder$Body$$inlined$toArgsArray$default$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$3), null);
        }
        AnyType[] anyTypeArr = {anyType, anyType2};
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
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.7
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2> SyncFunctionComponent Body(String name, final wn0.q<? super P0, ? super P1, ? super P2, ? extends R> body) {
        int i11;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$4 functionBuilder$Body$$inlined$toArgsArray$default$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$4
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$4), null);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$5 functionBuilder$Body$$inlined$toArgsArray$default$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$5
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$5), null);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$6 functionBuilder$Body$$inlined$toArgsArray$default$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$6
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i11 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$6), null);
        } else {
            i11 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i11, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i11, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i11, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.9
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3> SyncFunctionComponent Body(String name, final r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> body) {
        int i11;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$7 functionBuilder$Body$$inlined$toArgsArray$default$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$7
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$7), null);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$8 functionBuilder$Body$$inlined$toArgsArray$default$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$8), null);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$9 functionBuilder$Body$$inlined$toArgsArray$default$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$9), null);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$10 functionBuilder$Body$$inlined$toArgsArray$default$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$10
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i11 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$10), null);
        } else {
            i11 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i11, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i11, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i11, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.11
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.invoke((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4> SyncFunctionComponent Body(String name, final wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> body) {
        int i11;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$11 functionBuilder$Body$$inlined$toArgsArray$default$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$11
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$11), null);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$12 functionBuilder$Body$$inlined$toArgsArray$default$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$12), null);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$13 functionBuilder$Body$$inlined$toArgsArray$default$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$13), null);
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(3, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$14 functionBuilder$Body$$inlined$toArgsArray$default$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$14), null);
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(3, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$15 functionBuilder$Body$$inlined$toArgsArray$default$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i11 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$15), null);
        } else {
            i11 = 4;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i11, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i11, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i11, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.13
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.d((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SyncFunctionComponent Body(String name, final t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        AnyType anyType6;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType7 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$16 functionBuilder$Body$$inlined$toArgsArray$default$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$16
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$16), null);
        } else {
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$17 functionBuilder$Body$$inlined$toArgsArray$default$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$17
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$17), null);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$18 functionBuilder$Body$$inlined$toArgsArray$default$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$18
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$18), null);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$19 functionBuilder$Body$$inlined$toArgsArray$default$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$19
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(Object.class);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$19), null);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$20 functionBuilder$Body$$inlined$toArgsArray$default$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$20
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(Object.class);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$20), null);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$21 functionBuilder$Body$$inlined$toArgsArray$default$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(Object.class);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$21), null);
        } else {
            i21 = 4;
            anyType6 = anyType12;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i21, "R");
        ReturnType returnType = types.get(o0.b(Object.class));
        if (returnType == null) {
            s.q(i21, "R");
            returnType = new ReturnType(o0.b(Object.class));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i21, "R");
            types2.put(o0.b(Object.class), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.15
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.i((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SyncFunctionComponent Body(String name, final u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? extends R> body) {
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        AnyType anyType7;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType8 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$22 functionBuilder$Body$$inlined$toArgsArray$default$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$22
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(Object.class);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$22), null);
        } else {
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$23 functionBuilder$Body$$inlined$toArgsArray$default$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$23
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$23), null);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(r13);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$24 functionBuilder$Body$$inlined$toArgsArray$default$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$24
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$24), null);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(r13);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$25 functionBuilder$Body$$inlined$toArgsArray$default$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$25
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$25), null);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(r13);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$26 functionBuilder$Body$$inlined$toArgsArray$default$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$26
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$26), null);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(r13);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$27 functionBuilder$Body$$inlined$toArgsArray$default$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$27
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(r13);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$27), null);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(r13);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$28 functionBuilder$Body$$inlined$toArgsArray$default$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(r13);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, functionBuilder$Body$$inlined$toArgsArray$default$28), null);
        } else {
            i23 = 4;
            anyType7 = anyType14;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i23, "R");
        ReturnType returnType = types.get(o0.b(r13));
        if (returnType == null) {
            s.q(i23, "R");
            returnType = new ReturnType(o0.b(r13));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i23, "R");
            types2.put(o0.b(r13), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.17
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.k((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }

    public final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SyncFunctionComponent Body(String name, final v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? extends R> body) {
        Class cls;
        int i11;
        AnyType anyType;
        int i12;
        int i13;
        AnyType anyType2;
        int i14;
        int i15;
        AnyType anyType3;
        int i16;
        int i17;
        AnyType anyType4;
        int i18;
        int i19;
        AnyType anyType5;
        int i21;
        int i22;
        AnyType anyType6;
        int i23;
        int i24;
        AnyType anyType7;
        int i25;
        AnyType anyType8;
        s.k(name, "name");
        s.k(body, "body");
        s.q(4, "P0");
        s.q(4, "P1");
        s.q(4, "P2");
        s.q(4, "P3");
        s.q(4, "P4");
        s.q(4, "P5");
        s.q(4, "P6");
        s.q(4, "P7");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType9 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$29 functionBuilder$Body$$inlined$toArgsArray$default$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$29
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P0");
                    return null;
                }
            };
            cls = Object.class;
            s.q(4, "P0");
            co0.d dVarB2 = o0.b(cls);
            i11 = 3;
            s.q(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, functionBuilder$Body$$inlined$toArgsArray$default$29), null);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$30 functionBuilder$Body$$inlined$toArgsArray$default$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$30
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            i12 = 4;
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(cls);
            i13 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, functionBuilder$Body$$inlined$toArgsArray$default$30), null);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$31 functionBuilder$Body$$inlined$toArgsArray$default$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$31
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            i14 = 4;
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(cls);
            i15 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, functionBuilder$Body$$inlined$toArgsArray$default$31), null);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$32 functionBuilder$Body$$inlined$toArgsArray$default$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$32
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            i16 = 4;
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(cls);
            i17 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, functionBuilder$Body$$inlined$toArgsArray$default$32), null);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$33 functionBuilder$Body$$inlined$toArgsArray$default$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$33
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            i18 = 4;
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(cls);
            i19 = 3;
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, functionBuilder$Body$$inlined$toArgsArray$default$33), null);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$34 functionBuilder$Body$$inlined$toArgsArray$default$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$34
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            i21 = 4;
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, functionBuilder$Body$$inlined$toArgsArray$default$34), null);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$35 functionBuilder$Body$$inlined$toArgsArray$default$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, functionBuilder$Body$$inlined$toArgsArray$default$35), null);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        co0.d dVarB15 = o0.b(cls);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            FunctionBuilder$Body$$inlined$toArgsArray$default$36 functionBuilder$Body$$inlined$toArgsArray$default$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.FunctionBuilder$Body$$inlined$toArgsArray$default$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            i25 = 4;
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(cls);
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, functionBuilder$Body$$inlined$toArgsArray$default$36), null);
        } else {
            i25 = 4;
            anyType8 = anyType16;
        }
        AnyType[] anyTypeArr = {anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8};
        ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
        Map<co0.d<?>, ReturnType> types = returnTypeProvider.getTypes();
        s.q(i25, "R");
        ReturnType returnType = types.get(o0.b(cls));
        if (returnType == null) {
            s.q(i25, "R");
            returnType = new ReturnType(o0.b(cls));
            Map<co0.d<?>, ReturnType> types2 = returnTypeProvider.getTypes();
            s.q(i25, "R");
            types2.put(o0.b(cls), returnType);
        }
        SyncFunctionComponent syncFunctionComponent = new SyncFunctionComponent(name, anyTypeArr, returnType, new l<Object[], Object>() { // from class: expo.modules.kotlin.functions.FunctionBuilder.Body.19
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // wn0.l
            public final Object invoke(Object[] objArr) {
                s.k(objArr, "<destruct>");
                return body.g((P0) objArr[0], (P1) objArr[1], (P2) objArr[2], (P3) objArr[3], (P4) objArr[4], (P5) objArr[5], (P6) objArr[6], (P7) objArr[7]);
            }
        });
        setFunctionComponent(syncFunctionComponent);
        return syncFunctionComponent;
    }
}
