package bh0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0002\u0015\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001d¨\u0006\u001f"}, d2 = {"Lbh0/t2;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "componentConfigs", "Ljn0/h0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineScope;", "a", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Ljava/io/File;", "b", "Ljava/io/File;", "configFile", "Lbh0/t2$b;", "Lbh0/t2$b;", "savedData", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CoroutineScope coroutineScope;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File configFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b savedData;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lbh0/t2$b;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "uiComponentConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "()Ljava/util/List;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String sessionToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String inquiryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String stepName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final List<UiComponentConfig> uiComponentConfig;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(b.class.getClassLoader()));
                }
                return new b(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(String sessionToken, String inquiryId, String stepName, List<? extends UiComponentConfig> uiComponentConfig) {
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(uiComponentConfig, "uiComponentConfig");
            this.sessionToken = sessionToken;
            this.inquiryId = inquiryId;
            this.stepName = stepName;
            this.uiComponentConfig = uiComponentConfig;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getStepName() {
            return this.stepName;
        }

        public final List<UiComponentConfig> c() {
            return this.uiComponentConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: o, reason: from getter */
        public final String getSessionToken() {
            return this.sessionToken;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeString(this.inquiryId);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.uiComponentConfig;
            dest.writeInt(list.size());
            Iterator<UiComponentConfig> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$clearSavedState$2", f = "UiStepSavedStateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17360n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t2.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f17360n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            t2.this.configFile.delete();
            t2.this.savedData = null;
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2", f = "UiStepSavedStateHelper.kt", i = {0, 1}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 163}, m = "invokeSuspend", n = {"parcel", "restoredData"}, s = {"L$0", "L$0"})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super List<? extends UiComponentConfig>>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f17362n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f17363o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ String f17365q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f17366r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ String f17367s;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17368n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ t2 f17369o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ b f17370p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t2 t2Var, b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f17369o = t2Var;
                this.f17370p = bVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f17369o, this.f17370p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17368n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                this.f17369o.savedData = this.f17370p;
                return jn0.h0.f84049a;
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$restoreComponentConfigs$2$restoredData$1", f = "UiStepSavedStateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17371n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ t2 f17372o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Parcel f17373p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(t2 t2Var, Parcel parcel, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f17372o = t2Var;
                this.f17373p = parcel;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new b(this.f17372o, this.f17373p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17371n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                FileInputStream fileInputStream = new FileInputStream(this.f17372o.configFile);
                Parcel parcel = this.f17373p;
                try {
                    byte[] bArrC = sn0.a.c(fileInputStream);
                    parcel.unmarshall(bArrC, 0, bArrC.length);
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    sn0.b.a(fileInputStream, null);
                    return jn0.h0.f84049a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(fileInputStream, th2);
                        throw th3;
                    }
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, String str3, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f17365q = str;
            this.f17366r = str2;
            this.f17367s = str3;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t2.this.new d(this.f17365q, this.f17366r, this.f17367s, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00bb, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r9, r2, r8) == r1) goto L43;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v11 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v8, types: [android.os.Parcel] */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Class<bh0.t2$b> r0 = bh0.t2.b.class
                java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r8.f17363o
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L2c
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r8.f17362n
                bh0.t2$b r0 = (bh0.t2.b) r0
                jn0.t.b(r9)     // Catch: java.lang.Exception -> Lc3
                goto Lbe
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r2 = r8.f17362n
                android.os.Parcel r2 = (android.os.Parcel) r2
                jn0.t.b(r9)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                goto L5b
            L2a:
                r9 = move-exception
                goto L78
            L2c:
                jn0.t.b(r9)
                bh0.t2 r9 = bh0.t2.this
                java.io.File r9 = bh0.t2.a(r9)
                boolean r9 = r9.exists()
                if (r9 != 0) goto L3c
                return r5
            L3c:
                android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch: java.lang.Exception -> Lc3
                java.lang.String r9 = "obtain(...)"
                p013kotlin.jvm.internal.s.j(r2, r9)     // Catch: java.lang.Exception -> Lc3
                kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                bh0.t2$d$b r6 = new bh0.t2$d$b     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                bh0.t2 r7 = bh0.t2.this     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                r6.<init>(r7, r2, r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                r8.f17362n = r2     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                r8.f17363o = r4     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r6, r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                if (r9 != r1) goto L5b
                goto Lbd
            L5b:
                r9 = 0
                r2.setDataPosition(r9)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                java.lang.ClassLoader r9 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                android.os.Bundle r9 = r2.readBundle(r9)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                if (r9 == 0) goto L72
                java.lang.String r4 = "data"
                java.lang.Object r9 = q5.c.a(r9, r4, r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                bh0.t2$b r9 = (bh0.t2.b) r9     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L7c
                goto L73
            L72:
                r9 = r5
            L73:
                r2.recycle()     // Catch: java.lang.Exception -> Lc3
                r0 = r9
                goto L80
            L78:
                r2.recycle()     // Catch: java.lang.Exception -> Lc3
                throw r9     // Catch: java.lang.Exception -> Lc3
            L7c:
                r2.recycle()     // Catch: java.lang.Exception -> Lc3
                r0 = r5
            L80:
                if (r0 != 0) goto L83
                return r5
            L83:
                java.lang.String r9 = r0.getSessionToken()     // Catch: java.lang.Exception -> Lc3
                java.lang.String r2 = r8.f17365q     // Catch: java.lang.Exception -> Lc3
                boolean r9 = p013kotlin.jvm.internal.s.f(r9, r2)     // Catch: java.lang.Exception -> Lc3
                if (r9 == 0) goto Lc3
                java.lang.String r9 = r0.getInquiryId()     // Catch: java.lang.Exception -> Lc3
                java.lang.String r2 = r8.f17366r     // Catch: java.lang.Exception -> Lc3
                boolean r9 = p013kotlin.jvm.internal.s.f(r9, r2)     // Catch: java.lang.Exception -> Lc3
                if (r9 == 0) goto Lc3
                java.lang.String r9 = r0.getStepName()     // Catch: java.lang.Exception -> Lc3
                java.lang.String r2 = r8.f17367s     // Catch: java.lang.Exception -> Lc3
                boolean r9 = p013kotlin.jvm.internal.s.f(r9, r2)     // Catch: java.lang.Exception -> Lc3
                if (r9 != 0) goto La8
                goto Lc3
            La8:
                kotlinx.coroutines.MainCoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> Lc3
                bh0.t2$d$a r2 = new bh0.t2$d$a     // Catch: java.lang.Exception -> Lc3
                bh0.t2 r4 = bh0.t2.this     // Catch: java.lang.Exception -> Lc3
                r2.<init>(r4, r0, r5)     // Catch: java.lang.Exception -> Lc3
                r8.f17362n = r0     // Catch: java.lang.Exception -> Lc3
                r8.f17363o = r3     // Catch: java.lang.Exception -> Lc3
                java.lang.Object r9 = kotlinx.coroutines.BuildersKt.withContext(r9, r2, r8)     // Catch: java.lang.Exception -> Lc3
                if (r9 != r1) goto Lbe
            Lbd:
                return r1
            Lbe:
                java.util.List r5 = r0.c()     // Catch: java.lang.Exception -> Lc3
            Lc3:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: bh0.t2.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends UiComponentConfig>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2", f = "UiStepSavedStateHelper.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f17374n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f17376p;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2$1", f = "UiStepSavedStateHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f17377n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ t2 f17378o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ Bundle f17379p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t2 t2Var, Bundle bundle, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f17378o = t2Var;
                this.f17379p = bundle;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
                return new a(this.f17378o, this.f17379p, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f17377n != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.f17378o.configFile);
                Bundle bundle = this.f17379p;
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    p013kotlin.jvm.internal.s.j(parcelObtain, "obtain(...)");
                    parcelObtain.writeBundle(bundle);
                    fileOutputStream.write(parcelObtain.marshall());
                    parcelObtain.recycle();
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    sn0.b.a(fileOutputStream, null);
                    return jn0.h0.f84049a;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }

            @Override // wn0.p
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f17376p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return t2.this.new e(this.f17376p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f17374n;
            try {
                if (i11 == 0) {
                    jn0.t.b(obj);
                    File parentFile = t2.this.configFile.getParentFile();
                    if (parentFile != null) {
                        Boxing.boxBoolean(parentFile.mkdirs());
                    }
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("data", this.f17376p);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    a aVar = new a(t2.this, bundle, null);
                    this.f17374n = 1;
                    if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jn0.t.b(obj);
                }
            } catch (Exception unused) {
            }
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    public t2(Context applicationContext) {
        p013kotlin.jvm.internal.s.k(applicationContext, "applicationContext");
        this.coroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this.configFile = new File(new File(applicationContext.getFilesDir(), ".com.withpersona.sdk2.inquiry"), "ui_step_config");
    }

    public final Object c(Continuation<? super jn0.h0> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new c(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : jn0.h0.f84049a;
    }

    public final Object d(String str, String str2, String str3, Continuation<? super List<? extends UiComponentConfig>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new d(str, str2, str3, null), continuation);
    }

    public final void e(String sessionToken, String inquiryId, String stepName, List<? extends UiComponentConfig> componentConfigs) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(stepName, "stepName");
        if (!p013kotlin.jvm.internal.s.f(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            throw new IllegalArgumentException("saveComponentConfigs must be called on the main thread.");
        }
        if (componentConfigs == null) {
            return;
        }
        b bVar = this.savedData;
        if (p013kotlin.jvm.internal.s.f(bVar != null ? bVar.getSessionToken() : null, sessionToken)) {
            b bVar2 = this.savedData;
            if (p013kotlin.jvm.internal.s.f(bVar2 != null ? bVar2.getInquiryId() : null, inquiryId)) {
                b bVar3 = this.savedData;
                if (p013kotlin.jvm.internal.s.f(bVar3 != null ? bVar3.getStepName() : null, stepName)) {
                    return;
                }
            }
        }
        b bVar4 = new b(sessionToken, inquiryId, stepName, componentConfigs);
        this.savedData = bVar4;
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new e(bVar4, null), 3, null);
    }
}
