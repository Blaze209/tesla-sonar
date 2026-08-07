package com.fourthline.orca.internal;

import android.content.Context;
import android.content.Intent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import com.fourthline.nfc.ExtraNfcScannerConfig;
import com.fourthline.nfc.NfcScannerCallback;
import com.fourthline.nfc.NfcScannerComposableKt;
import com.fourthline.nfc.NfcScannerConfig;
import com.fourthline.sdk.R;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.source.ClippingMediaSource;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p009i2.C4670d1;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class In {

    static final class a implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3903uh f26327a;

        a(InterfaceC3903uh interfaceC3903uh) {
            this.f26327a = interfaceC3903uh;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-951632809, i11, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CloseButton.<anonymous> (NfcScannerScreen.kt:241)");
            }
            p009i2.e1.a(AbstractC3946vh.a(this.f26327a, lVar, 0), null, null, AbstractC3611np.a(C3825sp.f35377a.b(lVar, 6)).b().a(lVar, 0), lVar, 48, 4);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class b implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ En f26328a;

        b(En en2) {
            this.f26328a = en2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(154800204, i11, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Footer.<anonymous>.<anonymous>.<anonymous> (NfcScannerScreen.kt:288)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(companion, "hintView", (String) null, 2, (Object) null);
            i4.d dVarB = RA.b(this.f26328a.a(), lVar, 0);
            t4.j.Companion companion2 = t4.j.INSTANCE;
            int iA = companion2.a();
            C3825sp c3825sp = C3825sp.f35377a;
            TextElement header = c3825sp.b(lVar, 6).getScreen().getHeader();
            C3825sp.a aVar = C3825sp.a.f35378a;
            p009i2.v2.c(dVarB, dVarA, 0L, 0L, null, null, null, 0L, null, t4.j.h(iA), 0L, 0, false, 0, 0, null, null, header.a(w4.v.b(aVar.b()), lVar, 6, 0), lVar, 0, 0, 130556);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(16)), lVar, 6);
            androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(companion, "hintView", (String) null, 2, (Object) null);
            p009i2.v2.c(RA.b(this.f26328a.b(), lVar, 0), dVarA2, 0L, 0L, null, null, null, 0L, null, t4.j.h(companion2.a()), 0L, 0, false, 0, 0, null, null, c3825sp.b(lVar, 6).getScreen().getMessage().a(w4.v.b(aVar.a()), lVar, 6, 0), lVar, 0, 0, 130556);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f26330b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p020r2.p1 f26332d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f.h f26333e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Lazy f26334f;

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26335a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26336b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f26337c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ p020r2.p1 f26338d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ f.h f26339e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Lazy f26340f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, p020r2.p1 p1Var, f.h hVar, Lazy lazy, Continuation continuation) {
                super(2, continuation);
                this.f26337c = context;
                this.f26338d = p1Var;
                this.f26339e = hVar;
                this.f26340f = lazy;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(An an2, Continuation continuation) {
                return ((a) create(an2, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f26337c, this.f26338d, this.f26339e, this.f26340f, continuation);
                aVar.f26336b = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f26335a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                An an2 = (An) this.f26336b;
                if (!(an2 instanceof An.c)) {
                    if (an2 instanceof An.e) {
                        AbstractC3972w5.a(this.f26337c, 0L, 1, null);
                    } else if (an2 instanceof An.a) {
                        this.f26338d.setValue(Boxing.boxBoolean(false));
                    } else if (an2 instanceof An.b) {
                        this.f26338d.setValue(Boxing.boxBoolean(true));
                    } else {
                        if (!(an2 instanceof An.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f26339e.b(In.a(this.f26340f));
                    }
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Flow flow, Context context, p020r2.p1 p1Var, f.h hVar, Lazy lazy, Continuation continuation) {
            super(2, continuation);
            this.f26330b = flow;
            this.f26331c = context;
            this.f26332d = p1Var;
            this.f26333e = hVar;
            this.f26334f = lazy;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f26330b, this.f26331c, this.f26332d, this.f26333e, this.f26334f, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26329a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flow = this.f26330b;
                if (flow != null) {
                    a aVar = new a(this.f26331c, this.f26332d, this.f26333e, this.f26334f, null);
                    this.f26329a = 1;
                    if (AbstractC3989wg.a(flow, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class d extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26342b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f26342b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f26342b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26341a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f26342b.invoke(Bn.d.f25104a);
            return jn0.h0.f84049a;
        }
    }

    public static final class e implements p020r2.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.l f26343a;

        public e(wn0.l lVar) {
            this.f26343a = lVar;
        }

        @Override // p020r2.k0
        public void dispose() {
            this.f26343a.invoke(Bn.c.f25103a);
        }
    }

    static final class f extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ En.e.a f26345b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f26346c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Pair f26347d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.k f26348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f26349f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(En.e.a aVar, Context context, Pair pair, com.google.android.exoplayer2.k kVar, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f26345b = aVar;
            this.f26346c = context;
            this.f26347d = pair;
            this.f26348e = kVar;
            this.f26349f = z11;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f26345b, this.f26346c, this.f26347d, this.f26348e, this.f26349f, continuation);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.google.android.exoplayer2.x0 x0VarD;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26344a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            En.e.a aVar = this.f26345b;
            if (aVar instanceof En.e.a.C0486a) {
                x0VarD = com.google.android.exoplayer2.x0.d(((En.e.a.C0486a) aVar).a());
            } else {
                if (!(aVar instanceof En.e.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                x0VarD = com.google.android.exoplayer2.x0.d(RawResourceDataSource.buildRawResourceUri(((En.e.a.b) aVar).a()));
            }
            p013kotlin.jvm.internal.s.h(x0VarD);
            com.google.android.exoplayer2.source.o oVarB = new com.google.android.exoplayer2.source.i(this.f26346c).b(x0VarD);
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long jIntValue = ((Number) this.f26347d.e()).intValue();
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            ClippingMediaSource clippingMediaSource = new ClippingMediaSource(oVarB, timeUnit.convert(jIntValue, timeUnit2), timeUnit.convert(((Number) this.f26347d.f()).intValue(), timeUnit2));
            com.google.android.exoplayer2.k kVar = this.f26348e;
            boolean z11 = this.f26349f;
            kVar.c(clippingMediaSource);
            kVar.b();
            kVar.G(true);
            kVar.i(z11 ? 1 : 0);
            return jn0.h0.f84049a;
        }
    }

    public static final class g implements p020r2.k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.google.android.exoplayer2.k f26350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h f26351b;

        public g(com.google.android.exoplayer2.k kVar, h hVar) {
            this.f26350a = kVar;
            this.f26351b = hVar;
        }

        @Override // p020r2.k0
        public void dispose() {
            com.google.android.exoplayer2.k kVar = this.f26350a;
            kVar.G0(this.f26351b);
            kVar.release();
        }
    }

    public static final class h implements com.google.android.exoplayer2.v1.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ wn0.a f26352a;

        h(wn0.a aVar) {
            this.f26352a = aVar;
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.a aVar) {
            super.onAudioAttributesChanged(aVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i11) {
            super.onAudioSessionIdChanged(i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.v1.b bVar) {
            super.onAvailableCommandsChanged(bVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onCues(gs.f fVar) {
            super.onCues(fVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.j jVar) {
            super.onDeviceInfoChanged(jVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i11, boolean z11) {
            super.onDeviceVolumeChanged(i11, z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onEvents(com.google.android.exoplayer2.v1 v1Var, com.google.android.exoplayer2.v1.c cVar) {
            super.onEvents(v1Var, cVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z11) {
            super.onIsLoadingChanged(z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z11) {
            super.onIsPlayingChanged(z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z11) {
            super.onLoadingChanged(z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j11) {
            super.onMaxSeekToPreviousPositionChanged(j11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.x0 x0Var, int i11) {
            super.onMediaItemTransition(x0Var, i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.y0 y0Var) {
            super.onMediaMetadataChanged(y0Var);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onMetadata(ur.a aVar) {
            super.onMetadata(aVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z11, int i11) {
            super.onPlayWhenReadyChanged(z11, i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.u1 u1Var) {
            super.onPlaybackParametersChanged(u1Var);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onPlaybackStateChanged(int i11) {
            if (i11 == 4) {
                this.f26352a.invoke();
            }
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i11) {
            super.onPlaybackSuppressionReasonChanged(i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            super.onPlayerError(playbackException);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            super.onPlayerErrorChanged(playbackException);
        }

        @Override // com.google.android.exoplayer2.v1.d
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z11, int i11) {
            super.onPlayerStateChanged(z11, i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.y0 y0Var) {
            super.onPlaylistMetadataChanged(y0Var);
        }

        @Override // com.google.android.exoplayer2.v1.d
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i11) {
            super.onPositionDiscontinuity(i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i11) {
            super.onRepeatModeChanged(i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j11) {
            super.onSeekBackIncrementChanged(j11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j11) {
            super.onSeekForwardIncrementChanged(j11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z11) {
            super.onShuffleModeEnabledChanged(z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z11) {
            super.onSkipSilenceEnabledChanged(z11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i11, int i12) {
            super.onSurfaceSizeChanged(i11, i12);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.f2 f2Var, int i11) {
            super.onTimelineChanged(f2Var, i11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(qs.y yVar) {
            super.onTrackSelectionParametersChanged(yVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.g2 g2Var) {
            super.onTracksChanged(g2Var);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(us.z zVar) {
            super.onVideoSizeChanged(zVar);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f11) {
            super.onVolumeChanged(f11);
        }

        @Override // com.google.android.exoplayer2.v1.d
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
            super.onCues((List<gs.b>) list);
        }

        @Override // com.google.android.exoplayer2.v1.d
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.v1.e eVar, com.google.android.exoplayer2.v1.e eVar2, int i11) {
            super.onPositionDiscontinuity(eVar, eVar2, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, InterfaceC3903uh interfaceC3903uh, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, interfaceC3903uh, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(En en2, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        b(en2, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 c(wn0.l lVar) {
        lVar.invoke(Bn.b.f25102a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(int i11, int i12, int i13, p020r2.l lVar, int i14) {
        a(i11, i12, lVar, p020r2.k2.a(i13 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(En en2, int i11, p020r2.l lVar, int i12) {
        a(en2, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void b(final En state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(2043035487);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onEventSent) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(2043035487, i12, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerViewWithLoader (NfcScannerScreen.kt:159)");
            }
            if (state instanceof En.a) {
                lVarV.o(-508086356);
                En.a aVar = (En.a) state;
                Ly.a(aVar.a(), aVar.p(), null, null, lVarV, 0, 12);
                lVarV.l();
            } else {
                lVarV.o(-507964774);
                a(state, onEventSent, lVarV, i12 & 126);
                lVarV.l();
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ye0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.b(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(En en2, NfcScannerConfig nfcScannerConfig, ExtraNfcScannerConfig extraNfcScannerConfig, NfcScannerCallback nfcScannerCallback, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(en2, nfcScannerConfig, extraNfcScannerConfig, nfcScannerCallback, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(En en2, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(en2, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, En.e.a aVar, Pair pair, boolean z11, wn0.a aVar2, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, aVar, pair, z11, aVar2, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Cn cn2, int i11, p020r2.l lVar, int i12) {
        a(cn2, lVar, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    public static final void a(final En state, final NfcScannerConfig config, final ExtraNfcScannerConfig extraConfig, final NfcScannerCallback callback, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        Object cVar;
        int i13;
        Continuation continuation;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(config, "config");
        p013kotlin.jvm.internal.s.k(extraConfig, "extraConfig");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(1431913037);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? lVarV.n(config) : lVarV.K(config) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? lVarV.n(extraConfig) : lVarV.K(extraConfig) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(callback) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarV.K(flow) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i11) == 0) {
            i12 |= lVarV.K(onEventSent) ? 131072 : 65536;
        }
        int i14 = i12;
        if ((74899 & i14) == 74898 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1431913037, i14, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerScreen (NfcScannerScreen.kt:101)");
            }
            lVarV.o(1614930479);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(Boolean.TRUE, null, 2, null);
                lVarV.B(objI);
            }
            p020r2.p1 p1Var = (p020r2.p1) objI;
            lVarV.l();
            Context context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(1614933974);
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.re0
                    @Override // wn0.a
                    public final Object invoke() {
                        return In.a();
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            Lazy lazyB = jn0.m.b((wn0.a) objI2);
            ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
            lVarV.o(1614939363);
            int i15 = 458752 & i14;
            boolean z11 = i15 == 131072;
            Object objI3 = lVarV.I();
            if (z11 || objI3 == companion.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.se0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return In.a(onEventSent, (h.a) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            f.h hVarA = f.c.a(activityResultContracts$StartActivityForResult, (wn0.l) objI3, lVarV, 0);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(1614942316);
            boolean zK = lVarV.K(flow) | lVarV.K(context) | lVarV.K(hVarA) | lVarV.K(lazyB);
            Object objI4 = lVarV.I();
            if (zK || objI4 == companion.a()) {
                i13 = i15;
                continuation = null;
                cVar = new c(flow, context, p1Var, hVarA, lazyB, null);
                lVarV.B(cVar);
            } else {
                cVar = objI4;
                continuation = null;
                i13 = i15;
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) cVar, lVarV, 6);
            lVarV.o(1614957156);
            boolean z12 = i13 == 131072;
            Object objI5 = lVarV.I();
            if (z12 || objI5 == companion.a()) {
                objI5 = new wn0.l() { // from class: com.fourthline.orca.internal.te0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return In.a(onEventSent, (p020r2.l0) obj);
                    }
                };
                lVarV.B(objI5);
            }
            lVarV.l();
            Function0.c(h0Var, (wn0.l) objI5, lVarV, 6);
            lVarV.o(1614960450);
            boolean z13 = i13 == 131072;
            Object objI6 = lVarV.I();
            if (z13 || objI6 == companion.a()) {
                objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.ue0
                    @Override // wn0.a
                    public final Object invoke() {
                        return In.a(onEventSent);
                    }
                };
                lVarV.B(objI6);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI6, lVarV, 0, 1);
            b(state, onEventSent, lVarV, (i14 & 14) | ((i14 >> 12) & 112));
            lVarV.o(1614964723);
            if (((Boolean) p1Var.getValue()).booleanValue()) {
                int i16 = i14 >> 3;
                NfcScannerComposableKt.NfcScanner(config, extraConfig, callback, lVarV, NfcScannerConfig.$stable | (i16 & 14) | (ExtraNfcScannerConfig.$stable << 3) | (i16 & 112) | (i16 & 896));
            }
            lVarV.l();
            AbstractC3480kn.a(lVarV, 0);
            lVarV.o(1614971742);
            boolean z14 = i13 == 131072;
            Object objI7 = lVarV.I();
            if (z14 || objI7 == companion.a()) {
                objI7 = new d(onEventSent, continuation);
                lVarV.B(objI7);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI7, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ve0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.a(state, config, extraConfig, callback, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar) {
        lVar.invoke(Bn.e.f25105a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.h0(semantics, g4.g.INSTANCE.a());
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a() {
        return new Intent("android.settings.NFC_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent a(Lazy lazy) {
        return (Intent) lazy.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, h.a it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(Bn.a.f25101a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(Bn.c.f25103a);
        return jn0.h0.f84049a;
    }

    public static final void a(final En state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-1341579304);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(state) : lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onEventSent) ? 32 : 16;
        }
        int i13 = i12;
        if ((i13 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1341579304, i13, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.NfcScannerView (NfcScannerScreen.kt:175)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarA = AbstractC3307gk.a(AbstractC3307gk.b(companion, "nfc_scan"));
            C3825sp c3825sp = C3825sp.f35377a;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(androidx.compose.foundation.b.d(dVarA, AbstractC3611np.a(c3825sp.b(lVarV, 6)).a().a(lVarV, 0), null, 2, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            lVarV.o(1934317666);
            Object objI = lVarV.I();
            p020r2.l.Companion companion2 = p020r2.l.INSTANCE;
            if (objI == companion2.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.af0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return In.a((g4.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.ui.d dVarD = g4.o.d(dVarF, false, (wn0.l) objI, 1, null);
            v1.b.m mVarG = v1.b.f117444a.g();
            d3.c.Companion companion3 = d3.c.INSTANCE;
            z3.i0 i0VarA = v1.g.a(mVarG, companion3.k(), lVarV, 0);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarD);
            b4.g.Companion companion4 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarA, companion4.c());
            p020r2.d4.b(lVarA, xVarC, companion4.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion4.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion4.d());
            v1.j jVar = v1.j.f117505a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(AbstractC3307gk.a(AbstractC3307gk.a(companion), 2.0f), BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion3.n(), false);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarH);
            wn0.a<b4.g> aVarA2 = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarH, companion4.c());
            p020r2.d4.b(lVarA2, xVarC2, companion4.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion4.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion4.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            lVarV.o(198450337);
            En.e eVarO = state.o();
            androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(AbstractC3307gk.a(AbstractC3307gk.a((androidx.compose.ui.d) companion, false), "illustrationView", (String) null, 2, (Object) null), BitmapDescriptorFactory.HUE_RED, 1, null);
            En.e.a aVarC = eVarO.c();
            Pair pairB = eVarO.b();
            boolean zA = eVarO.a();
            lVarV.o(-750194895);
            int i14 = i13 & 112;
            boolean z11 = i14 == 32;
            Object objI2 = lVarV.I();
            if (z11 || objI2 == companion2.a()) {
                objI2 = new wn0.a() { // from class: com.fourthline.orca.internal.bf0
                    @Override // wn0.a
                    public final Object invoke() {
                        return In.b(onEventSent);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            a(dVarH2, aVarC, pairB, zA, (wn0.a) objI2, lVarV, 0, 0);
            lVarV = lVarV;
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.l();
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(AbstractC3307gk.a(companion, "closeButton", (String) null, 2, (Object) null), w4.h.g(16));
            InterfaceC3903uh interfaceC3903uhD = state.d();
            lVarV.o(198472842);
            boolean z12 = i14 == 32;
            Object objI3 = lVarV.I();
            if (z12 || objI3 == companion2.a()) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.cf0
                    @Override // wn0.a
                    public final Object invoke() {
                        return In.c(onEventSent);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            a(dVarI, interfaceC3903uhD, (wn0.a) objI3, lVarV, 0, 0);
            lVarV.g();
            androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(AbstractC3307gk.a(companion, (String) null, 1, (Object) null), 1.0f);
            lVarV.o(-1771606989);
            Object objI4 = lVarV.I();
            if (objI4 == companion2.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.df0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return In.b((g4.y) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(androidx.compose.foundation.layout.x.f(g4.o.d(dVarA2, false, (wn0.l) objI4, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, c3825sp.c(lVarV, 6).f(), 7, null);
            z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion3.o(), false);
            int iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC3 = lVarV.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarM);
            wn0.a<b4.g> aVarA3 = companion4.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarH2, companion4.c());
            p020r2.d4.b(lVarA3, xVarC3, companion4.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB3 = companion4.b();
            if (lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE3, companion4.d());
            a(state, lVarV, i13 & 14);
            lVarV.g();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ef0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.w.a(semantics, true);
        return jn0.h0.f84049a;
    }

    private static final void a(androidx.compose.ui.d dVar, final InterfaceC3903uh interfaceC3903uh, final wn0.a aVar, p020r2.l lVar, final int i11, final int i12) {
        int i13;
        p020r2.l lVarV = lVar.v(1490204859);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (lVarV.n(dVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(interfaceC3903uh) : lVarV.K(interfaceC3903uh) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.K(aVar) ? 256 : 128;
        }
        if ((i13 & 147) == 146 && lVarV.b()) {
            lVarV.j();
        } else {
            if (i14 != 0) {
                dVar = androidx.compose.ui.d.INSTANCE;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1490204859, i13, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CloseButton (NfcScannerScreen.kt:235)");
            }
            C4670d1.a(aVar, AbstractC3307gk.a(dVar, RA.c(QA.a.a(QA.f27433a, R.string.shared_button_close_acessibility, 0, 2, null), lVarV, 0), false, 2, (Object) null), false, null, z2.c.e(-951632809, true, new a(interfaceC3903uh), lVarV, 54), lVarV, ((i13 >> 6) & 14) | 24576, 12);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        final androidx.compose.ui.d dVar2 = dVar;
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.oe0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.a(dVar2, interfaceC3903uh, aVar, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0215  */
    /* JADX WARN: Code duplicated, block: B:63:0x0221  */
    /* JADX WARN: Code duplicated, block: B:64:0x0225  */
    /* JADX WARN: Code duplicated, block: B:69:0x0252  */
    /* JADX WARN: Code duplicated, block: B:72:0x0284  */
    private static final void a(final En en2, p020r2.l lVar, final int i11) {
        int i12;
        int i13;
        int iA;
        wn0.a<b4.g> aVarA;
        p020r2.l lVarA;
        wn0.p<b4.g, Integer, jn0.h0> pVarB;
        p020r2.l lVarV = lVar.v(1268757282);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(en2) : lVarV.K(en2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1268757282, i12, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Footer (NfcScannerScreen.kt:250)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarF = androidx.compose.foundation.layout.x.f(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            float fG = w4.h.g(32);
            C3825sp c3825sp = C3825sp.f35377a;
            androidx.compose.ui.d dVarL = androidx.compose.foundation.layout.t.l(dVarF, c3825sp.c(lVarV, 6).f(), fG, c3825sp.c(lVarV, 6).f(), w4.h.g(24));
            d3.c.Companion companion2 = d3.c.INSTANCE;
            d3.c.b bVarG = companion2.g();
            v1.b bVar = v1.b.f117444a;
            z3.i0 i0VarA = v1.g.a(bVar.g(), bVarG, lVarV, 48);
            int iA2 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarL);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA2 = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA2);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA2, i0VarA, companion3.c());
            p020r2.d4.b(lVarA2, xVarC, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE, companion3.d());
            v1.j jVar = v1.j.f117505a;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w4.h.g(72));
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.e(), false);
            int iA3 = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC2 = lVarV.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVarV, dVarI);
            wn0.a<b4.g> aVarA3 = companion3.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA3);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA3 = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA3, i0VarH, companion3.c());
            p020r2.d4.b(lVarA3, xVarC2, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB3 = companion3.b();
            if (lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE2, companion3.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            if (!(en2 instanceof En.a)) {
                if (en2 instanceof En.b) {
                    lVarV.o(-428660304);
                    a(((En.b) en2).p(), lVarV, 0);
                    lVarV.l();
                } else {
                    if (en2 instanceof En.c) {
                        lVarV.o(-428657648);
                        a(((En.c) en2).p(), lVarV, 0);
                        lVarV.l();
                    } else if (en2 instanceof En.d) {
                        lVarV.o(-403398832);
                        i13 = 6;
                        q1.b0.a(AbstractC3946vh.a(((En.d) en2).p(), lVarV, 0), null, androidx.compose.foundation.layout.x.f(companion, BitmapDescriptorFactory.HUE_RED, 1, null), null, null, BitmapDescriptorFactory.HUE_RED, null, lVarV, 432, 120);
                        lVarV.l();
                    } else {
                        lVarV.o(-428664768);
                        lVarV.l();
                        throw new NoWhenBranchMatchedException();
                    }
                    lVarV.g();
                    v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(16)), lVarV, i13);
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                    z3.i0 i0VarA2 = v1.g.a(bVar.g(), companion2.g(), lVarV, 48);
                    iA = p020r2.j.a(lVarV, 0);
                    p020r2.x xVarC3 = lVarV.c();
                    androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVarV, dVarH);
                    aVarA = companion3.a();
                    if (lVarV.w() == null) {
                        p020r2.j.c();
                    }
                    lVarV.h();
                    if (lVarV.getInserting()) {
                        lVarV.z(aVarA);
                    } else {
                        lVarV.d();
                    }
                    lVarA = p020r2.d4.a(lVarV);
                    p020r2.d4.b(lVarA, i0VarA2, companion3.c());
                    p020r2.d4.b(lVarA, xVarC3, companion3.e());
                    pVarB = companion3.b();
                    if (!lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                        lVarA.B(Integer.valueOf(iA));
                        lVarA.f(Integer.valueOf(iA), pVarB);
                    }
                    p020r2.d4.b(lVarA, dVarE3, companion3.d());
                    Ls.a(false, z2.c.e(154800204, true, new b(en2), lVarV, 54), lVarV, 48, 1);
                    lVarV.g();
                    lVarV.g();
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                }
                i13 = 6;
                lVarV.g();
                v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(16)), lVarV, i13);
                androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
                z3.i0 i0VarA3 = v1.g.a(bVar.g(), companion2.g(), lVarV, 48);
                iA = p020r2.j.a(lVarV, 0);
                p020r2.x xVarC4 = lVarV.c();
                androidx.compose.ui.d dVarE4 = androidx.compose.ui.c.e(lVarV, dVarH2);
                aVarA = companion3.a();
                if (lVarV.w() == null) {
                    p020r2.j.c();
                }
                lVarV.h();
                if (lVarV.getInserting()) {
                    lVarV.z(aVarA);
                } else {
                    lVarV.d();
                }
                lVarA = p020r2.d4.a(lVarV);
                p020r2.d4.b(lVarA, i0VarA3, companion3.c());
                p020r2.d4.b(lVarA, xVarC4, companion3.e());
                pVarB = companion3.b();
                if (!lVarA.getInserting()) {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                } else {
                    lVarA.B(Integer.valueOf(iA));
                    lVarA.f(Integer.valueOf(iA), pVarB);
                }
                p020r2.d4.b(lVarA, dVarE4, companion3.d());
                Ls.a(false, z2.c.e(154800204, true, new b(en2), lVarV, 54), lVarV, 48, 1);
                lVarV.g();
                lVarV.g();
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            } else {
                lVarV.o(-428663466);
                lVarV.l();
                AbstractC3989wg.a("There is no footer in LoadingState!");
                throw new KotlinNothingValueException();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.we0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.a(en2, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void a(final Cn cn2, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.l lVar2;
        p020r2.l lVarV = lVar.v(-528277062);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(cn2) : lVarV.K(cn2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) == 2 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-528277062, i12, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.ProgressAnimation (NfcScannerScreen.kt:310)");
            }
            if (cn2 instanceof Cn.b) {
                lVarV.o(494225118);
                float f11 = 64;
                TA.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.v(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, "loadingView", (String) null, 2, (Object) null), w4.h.g(f11)), w4.h.g(f11)), false, false, 0L, 0L, 0L, 0L, Integer.MAX_VALUE, BitmapDescriptorFactory.HUE_RED, null, ((Cn.b) cn2).a(), null, null, null, lVarV, 12582912, 0, 15230);
                lVar2 = lVarV;
                lVar2.l();
            } else {
                lVar2 = lVarV;
                if (cn2 instanceof Cn.a) {
                    lVar2.o(494237016);
                    Cn.a aVar = (Cn.a) cn2;
                    a(aVar.b(), aVar.a(), lVar2, 0);
                    lVar2.l();
                } else {
                    lVar2.o(494222917);
                    lVar2.l();
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.xe0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return In.a(cn2, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void a(final int i11, final int i12, p020r2.l lVar, final int i13) {
        int i14;
        p020r2.l lVarV = lVar.v(1358182915);
        int i15 = 2;
        if ((i13 & 6) == 0) {
            i14 = (lVarV.r(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        int i16 = 16;
        if ((i13 & 48) == 0) {
            i14 |= lVarV.r(i12) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1358182915, i14, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.CustomProgressBar (NfcScannerScreen.kt:334)");
            }
            Object obj = null;
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, "loadingView", (String) null, 2, (Object) null), w4.h.g(64));
            float f11 = BitmapDescriptorFactory.HUE_RED;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(dVarI, BitmapDescriptorFactory.HUE_RED, 1, null);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.b(), d3.c.INSTANCE.i(), lVarV, 54);
            int i17 = 0;
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarH);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarB, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.o(-423084377);
            int i18 = i11 + 1;
            int i19 = 1;
            while (i19 < i18) {
                ProgressElement progressElementC = AbstractC3611np.a(C3825sp.f35377a.b(lVarV, 6)).c();
                ColorElement highlight = i19 <= i12 ? progressElementC.getHighlight() : progressElementC.getBackground();
                p009i2.m2.a(androidx.compose.foundation.layout.x.v(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.t.k(androidx.compose.ui.d.INSTANCE, w4.h.g(3), f11, i15, obj), w4.h.g(i16)), w4.h.g(12)), p009i2.j1.f74525a.b(lVarV, p009i2.j1.f74526b).getMedium(), highlight.a(lVarV, i17), p009i2.s.b(highlight.a(lVarV, i17), lVarV, i17), null, w4.h.g(i17), C3927v4.f36005a.a(), lVarV, 1794054, 0);
                i19++;
                f11 = 0.0f;
                i16 = i16;
                i15 = 2;
                obj = obj;
                i17 = i17;
            }
            lVarV.l();
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ze0
                @Override // wn0.p
                public final Object invoke(Object obj2, Object obj3) {
                    return In.a(i11, i12, i13, (p020r2.l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0164  */
    /* JADX WARN: Code duplicated, block: B:103:0x016a  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:110:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:118:0x020b  */
    /* JADX WARN: Code duplicated, block: B:122:0x0215  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009a  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x010c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:90:0x0143  */
    /* JADX WARN: Code duplicated, block: B:93:0x014d  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:97:0x015a  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private static final void a(androidx.compose.ui.d dVar, final En.e.a aVar, final Pair pair, final boolean z11, final wn0.a aVar2, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.ui.d dVar3;
        final Context context;
        boolean z13;
        Object objI;
        final h hVar;
        Object objI2;
        p020r2.l.Companion companion;
        Object obj;
        final com.google.android.exoplayer2.k kVar;
        Object[] objArr;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Object fVar;
        Object[] objArr2;
        int i16;
        final int iK;
        boolean zK;
        Object objI3;
        p020r2.l lVar2;
        boolean zK2;
        Object objI4;
        final androidx.compose.ui.d dVar4;
        p020r2.l lVar3;
        p020r2.w2 w2VarX;
        p020r2.l lVarV = lVar.v(2039368192);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= (i11 & 64) == 0 ? lVarV.n(aVar) : lVarV.K(aVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(pair) ? 256 : 128;
        }
        if ((i12 & 8) == 0) {
            if ((i11 & 3072) == 0) {
                z12 = z11;
                i13 |= lVarV.p(z12) ? 2048 : 1024;
            }
            if ((i12 & 16) != 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                if (lVarV.K(aVar2)) {
                    i14 = 16384;
                } else {
                    i14 = PKIFailureInfo.certRevoked;
                }
                i13 |= i14;
            }
            i15 = i13;
            if ((i15 & 9363) != 9362 && lVarV.b()) {
                lVarV.j();
                dVar4 = dVar2;
                lVar3 = lVarV;
            } else {
                if (i17 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(2039368192, i15, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Player (NfcScannerScreen.kt:375)");
                }
                context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
                lVarV.o(49893267);
                if ((57344 & i15) == 16384) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objI = lVarV.I();
                if (!z13 || objI == p020r2.l.INSTANCE.a()) {
                    objI = new h(aVar2);
                    lVarV.B(objI);
                }
                hVar = (h) objI;
                lVarV.l();
                lVarV.o(49903103);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                obj = objI2;
                if (objI2 == companion.a()) {
                    com.google.android.exoplayer2.k kVarE = new com.google.android.exoplayer2.k.b(context).e();
                    kVarE.I0(hVar);
                    lVarV.B(kVarE);
                    obj = kVarE;
                }
                kVar = (com.google.android.exoplayer2.k) obj;
                lVarV.l();
                p013kotlin.jvm.internal.s.h(kVar);
                objArr = new Object[]{aVar, pair, Boolean.valueOf(z12), hVar};
                lVarV.o(49909294);
                if ((i15 & 112) != 32 || ((i15 & 64) != 0 && lVarV.K(aVar))) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zK3 = z14 | lVarV.K(context);
                if ((i15 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean zK4 = zK3 | z15 | lVarV.K(kVar);
                if ((i15 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = zK4 | z16;
                Object objI5 = lVarV.I();
                if (!z17 || objI5 == companion.a()) {
                    objArr2 = objArr;
                    i16 = 0;
                    fVar = new f(aVar, context, pair, kVar, z11, null);
                    lVarV.B(fVar);
                } else {
                    objArr2 = objArr;
                    fVar = objI5;
                    i16 = 0;
                }
                lVarV.l();
                Function0.h(objArr2, (wn0.p) fVar, lVarV, i16);
                iK = k3.r1.k(AbstractC3611np.a(C3825sp.f35377a.b(lVarV, 6)).a().a(lVarV, i16));
                lVarV.o(49939785);
                zK = lVarV.K(context) | lVarV.K(kVar) | lVarV.r(iK);
                objI3 = lVarV.I();
                if (!zK || objI3 == companion.a()) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ff0
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return In.a(context, kVar, iK, (Context) obj2);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                lVar2 = lVarV;
                androidx.compose.ui.d dVar5 = dVar3;
                androidx.compose.ui.viewinterop.f.a((wn0.l) objI3, dVar5, null, lVar2, (i15 << 3) & 112, 4);
                jn0.h0 h0Var = jn0.h0.f84049a;
                lVar2.o(49947268);
                zK2 = lVar2.K(kVar) | lVar2.n(hVar);
                objI4 = lVar2.I();
                if (!zK2 || objI4 == companion.a()) {
                    objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.pe0
                        @Override // wn0.l
                        public final Object invoke(Object obj2) {
                            return In.a(kVar, hVar, (p020r2.l0) obj2);
                        }
                    };
                    lVar2.B(objI4);
                }
                lVar2.l();
                Function0.c(h0Var, (wn0.l) objI4, lVar2, i16);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                dVar4 = dVar5;
                lVar3 = lVar2;
            }
            w2VarX = lVar3.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.qe0
                    @Override // wn0.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return In.a(dVar4, aVar, pair, z11, aVar2, i11, i12, (p020r2.l) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        z12 = z11;
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i11 & 24576) == 0) {
            if (lVarV.K(aVar2)) {
                i14 = 16384;
            } else {
                i14 = PKIFailureInfo.certRevoked;
            }
            i13 |= i14;
        }
        i15 = i13;
        if ((i15 & 9363) != 9362) {
            if (i17 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2039368192, i15, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Player (NfcScannerScreen.kt:375)");
            }
            context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(49893267);
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI = lVarV.I();
            if (!z13) {
                objI = new h(aVar2);
                lVarV.B(objI);
            } else {
                objI = new h(aVar2);
                lVarV.B(objI);
            }
            hVar = (h) objI;
            lVarV.l();
            lVarV.o(49903103);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            obj = objI2;
            if (objI2 == companion.a()) {
                com.google.android.exoplayer2.k kVarE2 = new com.google.android.exoplayer2.k.b(context).e();
                kVarE2.I0(hVar);
                lVarV.B(kVarE2);
                obj = kVarE2;
            }
            kVar = (com.google.android.exoplayer2.k) obj;
            lVarV.l();
            p013kotlin.jvm.internal.s.h(kVar);
            objArr = new Object[]{aVar, pair, Boolean.valueOf(z12), hVar};
            lVarV.o(49909294);
            if ((i15 & 112) != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            boolean zK5 = z14 | lVarV.K(context);
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zK6 = zK5 | z15 | lVarV.K(kVar);
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zK6 | z16;
            Object objI6 = lVarV.I();
            if (z17) {
                objArr2 = objArr;
                i16 = 0;
                fVar = new f(aVar, context, pair, kVar, z11, null);
                lVarV.B(fVar);
            } else {
                objArr2 = objArr;
                i16 = 0;
                fVar = new f(aVar, context, pair, kVar, z11, null);
                lVarV.B(fVar);
            }
            lVarV.l();
            Function0.h(objArr2, (wn0.p) fVar, lVarV, i16);
            iK = k3.r1.k(AbstractC3611np.a(C3825sp.f35377a.b(lVarV, 6)).a().a(lVarV, i16));
            lVarV.o(49939785);
            zK = lVarV.K(context) | lVarV.K(kVar) | lVarV.r(iK);
            objI3 = lVarV.I();
            if (!zK) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ff0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(context, kVar, iK, (Context) obj2);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ff0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(context, kVar, iK, (Context) obj2);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            lVar2 = lVarV;
            androidx.compose.ui.d dVar6 = dVar3;
            androidx.compose.ui.viewinterop.f.a((wn0.l) objI3, dVar6, null, lVar2, (i15 << 3) & 112, 4);
            jn0.h0 h0Var2 = jn0.h0.f84049a;
            lVar2.o(49947268);
            zK2 = lVar2.K(kVar) | lVar2.n(hVar);
            objI4 = lVar2.I();
            if (!zK2) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.pe0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(kVar, hVar, (p020r2.l0) obj2);
                    }
                };
                lVar2.B(objI4);
            } else {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.pe0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(kVar, hVar, (p020r2.l0) obj2);
                    }
                };
                lVar2.B(objI4);
            }
            lVar2.l();
            Function0.c(h0Var2, (wn0.l) objI4, lVar2, i16);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar6;
            lVar3 = lVar2;
        } else {
            if (i17 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2039368192, i15, -1, "com.fourthline.orca.core.internal.capabilities.nfc.scanner.Player (NfcScannerScreen.kt:375)");
            }
            context = (Context) lVarV.U(AndroidCompositionLocals_androidKt.g());
            lVarV.o(49893267);
            if ((57344 & i15) == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            objI = lVarV.I();
            if (!z13) {
                objI = new h(aVar2);
                lVarV.B(objI);
            } else {
                objI = new h(aVar2);
                lVarV.B(objI);
            }
            hVar = (h) objI;
            lVarV.l();
            lVarV.o(49903103);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            obj = objI2;
            if (objI2 == companion.a()) {
                com.google.android.exoplayer2.k kVarE3 = new com.google.android.exoplayer2.k.b(context).e();
                kVarE3.I0(hVar);
                lVarV.B(kVarE3);
                obj = kVarE3;
            }
            kVar = (com.google.android.exoplayer2.k) obj;
            lVarV.l();
            p013kotlin.jvm.internal.s.h(kVar);
            objArr = new Object[]{aVar, pair, Boolean.valueOf(z12), hVar};
            lVarV.o(49909294);
            if ((i15 & 112) != 32) {
                z14 = true;
            } else {
                z14 = true;
            }
            boolean zK7 = z14 | lVarV.K(context);
            if ((i15 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zK8 = zK7 | z15 | lVarV.K(kVar);
            if ((i15 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            z17 = zK8 | z16;
            Object objI7 = lVarV.I();
            if (z17) {
                objArr2 = objArr;
                i16 = 0;
                fVar = new f(aVar, context, pair, kVar, z11, null);
                lVarV.B(fVar);
            } else {
                objArr2 = objArr;
                i16 = 0;
                fVar = new f(aVar, context, pair, kVar, z11, null);
                lVarV.B(fVar);
            }
            lVarV.l();
            Function0.h(objArr2, (wn0.p) fVar, lVarV, i16);
            iK = k3.r1.k(AbstractC3611np.a(C3825sp.f35377a.b(lVarV, 6)).a().a(lVarV, i16));
            lVarV.o(49939785);
            zK = lVarV.K(context) | lVarV.K(kVar) | lVarV.r(iK);
            objI3 = lVarV.I();
            if (!zK) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ff0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(context, kVar, iK, (Context) obj2);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ff0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(context, kVar, iK, (Context) obj2);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            lVar2 = lVarV;
            androidx.compose.ui.d dVar7 = dVar3;
            androidx.compose.ui.viewinterop.f.a((wn0.l) objI3, dVar7, null, lVar2, (i15 << 3) & 112, 4);
            jn0.h0 h0Var3 = jn0.h0.f84049a;
            lVar2.o(49947268);
            zK2 = lVar2.K(kVar) | lVar2.n(hVar);
            objI4 = lVar2.I();
            if (!zK2) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.pe0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(kVar, hVar, (p020r2.l0) obj2);
                    }
                };
                lVar2.B(objI4);
            } else {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.pe0
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return In.a(kVar, hVar, (p020r2.l0) obj2);
                    }
                };
                lVar2.B(objI4);
            }
            lVar2.l();
            Function0.c(h0Var3, (wn0.l) objI4, lVar2, i16);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar4 = dVar7;
            lVar3 = lVar2;
        }
        w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.qe0
                @Override // wn0.p
                public final Object invoke(Object obj2, Object obj3) {
                    return In.a(dVar4, aVar, pair, z11, aVar2, i11, i12, (p020r2.l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StyledPlayerView a(Context context, com.google.android.exoplayer2.k kVar, int i11, Context it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        StyledPlayerView styledPlayerView = new StyledPlayerView(context);
        styledPlayerView.setPlayer(kVar);
        styledPlayerView.setUseController(false);
        styledPlayerView.setShutterBackgroundColor(i11);
        return styledPlayerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p020r2.k0 a(wn0.l lVar, p020r2.l0 DisposableEffect) {
        p013kotlin.jvm.internal.s.k(DisposableEffect, "$this$DisposableEffect");
        return new e(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p020r2.k0 a(com.google.android.exoplayer2.k kVar, h hVar, p020r2.l0 DisposableEffect) {
        p013kotlin.jvm.internal.s.k(DisposableEffect, "$this$DisposableEffect");
        return new g(kVar, hVar);
    }
}
