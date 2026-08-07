package kotlinx.coroutines.flow;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.wallet.WalletConstants;
import com.plaid.internal.EnumC4419g;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.DelayKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.CoroutineContext;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.l;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\t\u0010\b\u001a-\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\b\u001a3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aC\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0016\u001ag\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00122\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u0010\u0010\u0019\u001aU\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010\u001b\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a+\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b!\u0010\"\u001a+\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004H\u0007¢\u0006\u0004\b#\u0010\"\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001e\u0010$\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u001eH\u0007¢\u0006\u0004\b%\u0010 \u001a-\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)\u001aC\u0010+\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\"\u0010*\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\b+\u0010\u0016\u001a_\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00028\u00012*\b\u0001\u0010.\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\b/\u00100\u001a-\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u00102\u001aC\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00028\u00002\u0014\b\u0002\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u0002030\u001eH\u0007¢\u0006\u0004\b1\u00105\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00106\u001a\u00028\u0000H\u0007¢\u0006\u0004\b7\u00102\u001a3\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b7\u0010\r\u001a-\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u00106\u001a\u00028\u0000H\u0007¢\u0006\u0004\b9\u00102\u001a3\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\b9\u0010\r\u001ai\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010<\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\b=\u0010>\u001a\u0083\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042.\u0010<\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140AH\u0007¢\u0006\u0004\b=\u0010B\u001a\u009d\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010C\"\u0004\b\u0004\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u000424\u0010<\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140EH\u0007¢\u0006\u0004\b=\u0010F\u001a·\u0001\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010;\"\u0004\b\u0002\u0010?\"\u0004\b\u0003\u0010C\"\u0004\b\u0004\u0010G\"\u0004\b\u0005\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00020\u00042\f\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00040\u00042:\u0010<\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140IH\u0007¢\u0006\u0004\b=\u0010J\u001a-\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010L\u001a\u00020KH\u0007¢\u0006\u0004\bM\u0010N\u001a-\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010L\u001a\u00020KH\u0007¢\u0006\u0004\bO\u0010N\u001aU\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010<\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0012H\u0007¢\u0006\u0004\bP\u0010\u001d\u001aO\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042(\u0010.\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0007¢\u0006\u0004\bQ\u0010R\u001a%\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bS\u0010\"\u001a-\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010T\u001a\u00020&H\u0007¢\u0006\u0004\bS\u0010)\u001a%\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bU\u0010\"\u001a-\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010T\u001a\u00020&H\u0007¢\u0006\u0004\bU\u0010)\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007¢\u0006\u0004\bV\u0010\"¨\u0006W"}, d2 = {"", "noImpl", "()Ljava/lang/Void;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "observeOn", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;", "publishOn", "subscribeOn", "fallback", "onErrorResume", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "onErrorResumeNext", "Ljn0/h0;", "subscribe", "(Lkotlinx/coroutines/flow/Flow;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onEach", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;)V", "", "onError", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;Lwn0/p;)V", "R", "mapper", "flatMap", "(Lkotlinx/coroutines/flow/Flow;Lwn0/p;)Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Function1;", "concatMap", "(Lkotlinx/coroutines/flow/Flow;Lwn0/l;)Lkotlinx/coroutines/flow/Flow;", "merge", "(Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatten", "transformer", "compose", "", "count", "skip", "(Lkotlinx/coroutines/flow/Flow;I)Lkotlinx/coroutines/flow/Flow;", "action", "forEach", "initial", "Lkotlin/Function3;", "operation", "scanFold", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "onErrorReturn", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "", "predicate", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lwn0/l;)Lkotlinx/coroutines/flow/Flow;", "value", "startWith", "other", "concatWith", "T1", "T2", "transform", "combineLatest", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "T3", "other2", "Lkotlin/Function4;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lwn0/r;)Lkotlinx/coroutines/flow/Flow;", "T4", "other3", "Lkotlin/Function5;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lwn0/s;)Lkotlinx/coroutines/flow/Flow;", "T5", "other4", "Lkotlin/Function6;", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lwn0/t;)Lkotlinx/coroutines/flow/Flow;", "", "timeMillis", "delayFlow", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "delayEach", "switchMap", "scanReduce", "(Lkotlinx/coroutines/flow/Flow;Lwn0/q;)Lkotlinx/coroutines/flow/Flow;", "publish", "bufferSize", "replay", "cache", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "it", "Ljn0/h0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1<T> extends SuspendLambda implements p<T, Continuation<? super h0>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(long j11, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$timeMillis = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$timeMillis, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                long j11 = this.$timeMillis;
                this.label = 1;
                if (DelayKt.delay(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(T t11, Continuation<? super h0> continuation) {
            return ((AnonymousClass1) create(t11, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE}, m = "invokeSuspend", n = {}, s = {})
    static final class C47661<T> extends SuspendLambda implements p<FlowCollector<? super T>, Continuation<? super h0>, Object> {
        final /* synthetic */ long $timeMillis;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47661(long j11, Continuation<? super C47661> continuation) {
            super(2, continuation);
            this.$timeMillis = j11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C47661(this.$timeMillis, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                long j11 = this.$timeMillis;
                this.label = 1;
                if (DelayKt.delay(j11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super T> flowCollector, Continuation<? super h0> continuation) {
            return ((C47661) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "e", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2<T> extends SuspendLambda implements q<FlowCollector<? super T>, Throwable, Continuation<? super h0>, Object> {
        final /* synthetic */ T $fallback;
        final /* synthetic */ l<Throwable, Boolean> $predicate;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super Throwable, Boolean> lVar, T t11, Continuation<? super AnonymousClass2> continuation) {
            super(3, continuation);
            this.$predicate = lVar;
            this.$fallback = t11;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 == 0) {
                t.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Throwable th2 = (Throwable) this.L$1;
                if (!this.$predicate.invoke(th2).booleanValue()) {
                    throw th2;
                }
                T t11 = this.$fallback;
                this.L$0 = null;
                this.label = 1;
                if (flowCollector.emit(t11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.q
        public final Object invoke(FlowCollector<? super T> flowCollector, Throwable th2, Continuation<? super h0> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$predicate, this.$fallback, continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = th2;
            return anonymousClass2.invokeSuspend(h0.f84049a);
        }
    }

    @jn0.e
    public static final <T> Flow<T> cache(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T1, T2, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, q<? super T1, ? super T2, ? super Continuation<? super R>, ? extends Object> qVar) {
        return FlowKt.combine(flow, flow2, qVar);
    }

    @jn0.e
    public static final <T, R> Flow<R> compose(Flow<? extends T> flow, l<? super Flow<? extends T>, ? extends Flow<? extends R>> lVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T, R> Flow<R> concatMap(Flow<? extends T> flow, l<? super T, ? extends Flow<? extends R>> lVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, T t11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> delayEach(Flow<? extends T> flow, long j11) {
        return FlowKt.onEach(flow, new AnonymousClass1(j11, null));
    }

    @jn0.e
    public static final <T> Flow<T> delayFlow(Flow<? extends T> flow, long j11) {
        return FlowKt.onStart(flow, new C47661(j11, null));
    }

    @jn0.e
    public static final <T, R> Flow<R> flatMap(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> flatten(Flow<? extends Flow<? extends T>> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> void forEach(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> merge(Flow<? extends Flow<? extends T>> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static final Void noImpl() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @jn0.e
    public static final <T> Flow<T> observeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> onErrorResume(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> onErrorResumeNext(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Flow onErrorReturn$default(Flow flow, Object obj, l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            lVar = new l() { // from class: kotlinx.coroutines.flow.e
                @Override // wn0.l
                public final Object invoke(Object obj3) {
                    return Boolean.valueOf(FlowKt__MigrationKt.onErrorReturn$lambda$0$FlowKt__MigrationKt((Throwable) obj3));
                }
            };
        }
        return FlowKt.onErrorReturn(flow, obj, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onErrorReturn$lambda$0$FlowKt__MigrationKt(Throwable th2) {
        return true;
    }

    @jn0.e
    public static final <T> Flow<T> publish(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> publishOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> replay(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T, R> Flow<R> scanFold(Flow<? extends T> flow, R r11, q<? super R, ? super T, ? super Continuation<? super R>, ? extends Object> qVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> scanReduce(Flow<? extends T> flow, q<? super T, ? super T, ? super Continuation<? super T>, ? extends Object> qVar) {
        return FlowKt.runningReduce(flow, qVar);
    }

    @jn0.e
    public static final <T> Flow<T> skip(Flow<? extends T> flow, int i11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, T t11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> subscribeOn(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T, R> Flow<R> switchMap(Flow<? extends T> flow, p<? super T, ? super Continuation<? super Flow<? extends R>>, ? extends Object> pVar) {
        return FlowKt.transformLatest(flow, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @jn0.e
    public static final <T1, T2, T3, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, r<? super T1, ? super T2, ? super T3, ? super Continuation<? super R>, ? extends Object> rVar) {
        return FlowKt.combine(flow, flow2, flow3, rVar);
    }

    @jn0.e
    public static final <T> Flow<T> concatWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> onErrorReturn(Flow<? extends T> flow, T t11, l<? super Throwable, Boolean> lVar) {
        return FlowKt.m548catch(flow, new AnonymousClass2(lVar, t11, null));
    }

    @jn0.e
    public static final <T> Flow<T> publish(Flow<? extends T> flow, int i11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> replay(Flow<? extends T> flow, int i11) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> Flow<T> startWith(Flow<? extends T> flow, Flow<? extends T> flow2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T1, T2, T3, T4, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, s<? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super R>, ? extends Object> sVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, sVar);
    }

    @jn0.e
    public static final <T> void subscribe(Flow<? extends T> flow, p<? super T, ? super Continuation<? super h0>, ? extends Object> pVar, p<? super Throwable, ? super Continuation<? super h0>, ? extends Object> pVar2) {
        FlowKt.noImpl();
        throw new KotlinNothingValueException();
    }

    @jn0.e
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineLatest(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, wn0.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super Continuation<? super R>, ? extends Object> tVar) {
        return FlowKt.combine(flow, flow2, flow3, flow4, flow5, tVar);
    }
}
