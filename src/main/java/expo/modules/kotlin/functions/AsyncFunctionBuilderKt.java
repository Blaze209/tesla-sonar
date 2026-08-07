package expo.modules.kotlin.functions;

import co0.q;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;
import wn0.r;
import wn0.t;
import wn0.u;
import wn0.v;
import wn0.w;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001*\u00020\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\f\u001a[\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001*\u00020\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000f\u001ai\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001*\u00020\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0012\u001aw\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001*\u00020\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0015\u001a\u0085\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001*\u00020\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0018\u001a\u0093\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001*\u00020\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001b\u001a¡\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001*\u00020\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001dH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001e\u001a¯\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001\"\u0006\b\b\u0010\u001f\u0018\u0001*\u00020\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040 H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"R", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "block", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "Coroutine", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/l;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "P0", "Lkotlin/Function2;", "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P1", "Lkotlin/Function3;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P2", "Lkotlin/Function4;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P3", "Lkotlin/Function5;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P4", "Lkotlin/Function6;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P5", "Lkotlin/Function7;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P6", "Lkotlin/Function8;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/v;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P7", "Lkotlin/Function9;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lwn0/w;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "expo-modules-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AsyncFunctionBuilderKt {
    public static final /* synthetic */ <R> BaseAsyncFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, l<? super Continuation<? super R>, ? extends Object> block) {
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(asyncFunctionBuilder.getName(), new AnyType[0], new AsyncFunctionBuilder.C46321(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, p<? super P0, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        s.q(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType}, new AsyncFunctionBuilder.C46333(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, wn0.q<? super P0, ? super P1, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        s.q(4, "P0");
        s.q(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        s.q(4, "P0");
        co0.d dVarB = o0.b(Object.class);
        s.q(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2}, new AsyncFunctionBuilder.C46345(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, r<? super P0, ? super P1, ? super P2, ? super Continuation<? super R>, ? extends Object> block) {
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4), converters);
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5), converters);
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AsyncFunctionBuilder.AnonymousClass7(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, wn0.s<? super P0, ? super P1, ? super P2, ? super P3, ? super Continuation<? super R>, ? extends Object> block) {
        int i11;
        int i12;
        int i13;
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(Object.class);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new AsyncFunctionBuilder.AnonymousClass9(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, t<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super Continuation<? super R>, ? extends Object> block) {
        int i11;
        int i12;
        int i13;
        int i14;
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11), converters);
        } else {
            i11 = 3;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(r13);
        s.q(i11, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P1");
                    return null;
                }
            };
            s.q(4, "P1");
            co0.d dVarB4 = o0.b(Object.class);
            i12 = 3;
            s.q(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12), converters);
        } else {
            i12 = 3;
        }
        s.q(4, "P2");
        co0.d dVarB5 = o0.b(r13);
        s.q(i12, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P2");
                    return null;
                }
            };
            s.q(4, "P2");
            co0.d dVarB6 = o0.b(r13);
            i13 = 3;
            s.q(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13), converters);
        } else {
            i13 = 3;
        }
        s.q(4, "P3");
        co0.d dVarB7 = o0.b(r13);
        s.q(i13, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P3");
                    return null;
                }
            };
            s.q(4, "P3");
            co0.d dVarB8 = o0.b(r13);
            i14 = 3;
            s.q(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14), converters);
        } else {
            i14 = 3;
        }
        s.q(4, "P4");
        co0.d dVarB9 = o0.b(r13);
        s.q(i14, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P4");
                    return null;
                }
            };
            s.q(4, "P4");
            co0.d dVarB10 = o0.b(r13);
            s.q(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new AsyncFunctionBuilder.AnonymousClass11(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super Continuation<? super R>, ? extends Object> block) {
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
        AnyType anyType6;
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType7;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType8;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType9;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType10;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType11;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P5");
                    return null;
                }
            };
            s.q(4, "P5");
            co0.d dVarB12 = o0.b(cls);
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21), converters);
        } else {
            anyType6 = anyType12;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new AsyncFunctionBuilder.AnonymousClass13(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, v<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super Continuation<? super R>, ? extends Object> block) {
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
        AnyType anyType7;
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22), converters);
        } else {
            cls = Object.class;
            i11 = 3;
            anyType = anyType8;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(cls);
        s.q(i11, "P1");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType9 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType9;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(cls);
        s.q(i13, "P2");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType10;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(cls);
        s.q(i15, "P3");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType11;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(cls);
        s.q(i17, "P4");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType12;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(cls);
        s.q(i19, "P5");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27
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
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType13;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(cls);
        s.q(i22, "P6");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(cls);
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28), converters);
        } else {
            anyType7 = anyType14;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7}, new AsyncFunctionBuilder.AnonymousClass15(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, w<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super P6, ? super P7, ? super Continuation<? super R>, ? extends Object> block) {
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
        AnyType anyType8;
        s.k(asyncFunctionBuilder, "<this>");
        s.k(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
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
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29
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
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29), converters);
        } else {
            i11 = 3;
            anyType = anyType9;
        }
        s.q(4, "P1");
        co0.d dVarB3 = o0.b(Object.class);
        s.q(i11, "P1");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType10 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30
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
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30), converters);
        } else {
            i12 = 4;
            i13 = 3;
            anyType2 = anyType10;
        }
        s.q(i12, "P2");
        co0.d dVarB5 = o0.b(Object.class);
        s.q(i13, "P2");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType11 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31
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
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31), converters);
        } else {
            i14 = 4;
            i15 = 3;
            anyType3 = anyType11;
        }
        s.q(i14, "P3");
        co0.d dVarB7 = o0.b(Object.class);
        s.q(i15, "P3");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType12 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32
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
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32), converters);
        } else {
            i16 = 4;
            i17 = 3;
            anyType4 = anyType12;
        }
        s.q(i16, "P4");
        co0.d dVarB9 = o0.b(Object.class);
        s.q(i17, "P4");
        AnyType anyType13 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType13 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33
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
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33), converters);
        } else {
            i18 = 4;
            i19 = 3;
            anyType5 = anyType13;
        }
        s.q(i18, "P5");
        co0.d dVarB11 = o0.b(Object.class);
        s.q(i19, "P5");
        AnyType anyType14 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType14 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34
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
            i22 = 3;
            s.q(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34), converters);
        } else {
            i21 = 4;
            i22 = 3;
            anyType6 = anyType14;
        }
        s.q(i21, "P6");
        co0.d dVarB13 = o0.b(Object.class);
        s.q(i22, "P6");
        AnyType anyType15 = anyTypeProvider.getTypesMap().get(new Pair(dVarB13, false));
        if (anyType15 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P6");
                    return null;
                }
            };
            i23 = 4;
            s.q(4, "P6");
            co0.d dVarB14 = o0.b(Object.class);
            i24 = 3;
            s.q(3, "P6");
            anyType7 = new AnyType(new LazyKType(dVarB14, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35), converters);
        } else {
            i23 = 4;
            i24 = 3;
            anyType7 = anyType15;
        }
        s.q(i23, "P7");
        co0.d dVarB15 = o0.b(Object.class);
        s.q(i24, "P7");
        AnyType anyType16 = anyTypeProvider.getTypesMap().get(new Pair(dVarB15, false));
        if (anyType16 == null) {
            s.p();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36 = new wn0.a<q>() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // wn0.a
                public final q invoke() {
                    s.q(6, "P7");
                    return null;
                }
            };
            s.q(4, "P7");
            co0.d dVarB16 = o0.b(Object.class);
            s.q(3, "P7");
            anyType8 = new AnyType(new LazyKType(dVarB16, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36), converters);
        } else {
            anyType8 = anyType16;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6, anyType7, anyType8}, new AsyncFunctionBuilder.AnonymousClass17(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }
}
