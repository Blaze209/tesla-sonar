package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bh0.t2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.ui.network.ComponentParam;
import hi0.InquirySessionConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u001b'BI\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w;", "Ly20/o;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "", "sessionToken", "inquiryId", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "transitionData", "Lhh0/s;", "service", "Lmg0/a;", "fallbackModeManager", "Lbh0/t2;", "uiStepSavedStateHelper", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhi0/g;Lcom/withpersona/sdk2/inquiry/internal/w$c;Lhh0/s;Lmg0/a;Lbh0/t2;)V", "Lkotlinx/coroutines/flow/Flow;", "l", "()Lkotlinx/coroutines/flow/Flow;", "k", "run", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "c", IntegerTokenConverter.CONVERTER_KEY, DateTokenConverter.CONVERTER_KEY, "Lhi0/g;", "e", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "f", "Lhh0/s;", "g", "Lmg0/a;", "h", "Lbh0/t2;", "a", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w implements y20.o<b> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final TransitionData transitionData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final hh0.s service;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mg0.a fallbackModeManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t2 uiStepSavedStateHelper;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$a;", "", "", "sessionToken", "inquiryId", "Lhi0/g;", "inquirySessionConfig", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "transitionData", "Lcom/withpersona/sdk2/inquiry/internal/w;", "a", "(Ljava/lang/String;Ljava/lang/String;Lhi0/g;Lcom/withpersona/sdk2/inquiry/internal/w$c;)Lcom/withpersona/sdk2/inquiry/internal/w;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        w a(String sessionToken, String inquiryId, InquirySessionConfig inquirySessionConfig, TransitionData transitionData);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$b;", "", "<init>", "()V", "b", "a", "Lcom/withpersona/sdk2/inquiry/internal/w$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/w$b$b;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$b$a;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "cause", "<init>", "(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InternalErrorInfo cause;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(InternalErrorInfo cause) {
                super(null);
                p013kotlin.jvm.internal.s.k(cause, "cause");
                this.cause = cause;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InternalErrorInfo getCause() {
                return this.cause;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && p013kotlin.jvm.internal.s.f(this.cause, ((Error) other).cause);
            }

            public int hashCode() {
                return this.cause.hashCode();
            }

            public String toString() {
                return "Error(cause=" + this.cause + ")";
            }
        }

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$b$b;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "nextState", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/l;", "()Lcom/withpersona/sdk2/inquiry/internal/l;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final l nextState;

            public Success(l lVar) {
                super(null);
                this.nextState = lVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final l getNextState() {
                return this.nextState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && p013kotlin.jvm.internal.s.f(this.nextState, ((Success) other).nextState);
            }

            public int hashCode() {
                l lVar = this.nextState;
                if (lVar == null) {
                    return 0;
                }
                return lVar.hashCode();
            }

            public String toString() {
                return "Success(nextState=" + this.nextState + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$c, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0013J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u001c\u0010!R\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0015¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/w$c;", "Landroid/os/Parcelable;", "Loi0/n5;", "fromComponent", "", "", "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;", "componentParams", "fromStep", "<init>", "(Loi0/n5;Ljava/util/Map;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loi0/n5;", "b", "()Loi0/n5;", "Ljava/util/Map;", "()Ljava/util/Map;", "c", "Ljava/lang/String;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TransitionData implements Parcelable {
        public static final Parcelable.Creator<TransitionData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n5 fromComponent;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, ComponentParam> componentParams;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.w$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TransitionData> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TransitionData createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                n5 n5Var = (n5) parcel.readParcelable(TransitionData.class.getClassLoader());
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(TransitionData.class.getClassLoader()));
                }
                return new TransitionData(n5Var, linkedHashMap, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final TransitionData[] newArray(int i11) {
                return new TransitionData[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TransitionData(n5 fromComponent, Map<String, ? extends ComponentParam> componentParams, String fromStep) {
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(componentParams, "componentParams");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            this.fromComponent = fromComponent;
            this.componentParams = componentParams;
            this.fromStep = fromStep;
        }

        public final Map<String, ComponentParam> a() {
            return this.componentParams;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n5 getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFromStep() {
            return this.fromStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TransitionData)) {
                return false;
            }
            TransitionData transitionData = (TransitionData) other;
            return p013kotlin.jvm.internal.s.f(this.fromComponent, transitionData.fromComponent) && p013kotlin.jvm.internal.s.f(this.componentParams, transitionData.componentParams) && p013kotlin.jvm.internal.s.f(this.fromStep, transitionData.fromStep);
        }

        public int hashCode() {
            return (((this.fromComponent.hashCode() * 31) + this.componentParams.hashCode()) * 31) + this.fromStep.hashCode();
        }

        public String toString() {
            return "TransitionData(fromComponent=" + this.fromComponent + ", componentParams=" + this.componentParams + ", fromStep=" + this.fromStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.fromComponent, flags);
            Map<String, ComponentParam> map = this.componentParams;
            dest.writeInt(map.size());
            for (Map.Entry<String, ComponentParam> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.fromStep);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$run$1", f = "TransitionWorker.kt", i = {}, l = {35, 37}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58254n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58255o;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            d dVar = w.this.new d(continuation);
            dVar.f58255o = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
        
            return r0;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f58254n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                jn0.t.b(r5)
                goto L4c
            L1b:
                jn0.t.b(r5)
                java.lang.Object r5 = r4.f58255o
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                com.withpersona.sdk2.inquiry.internal.w r1 = com.withpersona.sdk2.inquiry.internal.w.this
                mg0.a r1 = com.withpersona.sdk2.inquiry.internal.w.b(r1)
                boolean r1 = r1.b()
                if (r1 == 0) goto L3d
                com.withpersona.sdk2.inquiry.internal.w r1 = com.withpersona.sdk2.inquiry.internal.w.this
                kotlinx.coroutines.flow.Flow r1 = com.withpersona.sdk2.inquiry.internal.w.g(r1)
                r4.f58254n = r3
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4)
                if (r5 != r0) goto L4c
                goto L4b
            L3d:
                com.withpersona.sdk2.inquiry.internal.w r1 = com.withpersona.sdk2.inquiry.internal.w.this
                kotlinx.coroutines.flow.Flow r1 = com.withpersona.sdk2.inquiry.internal.w.h(r1)
                r4.f58254n = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.emitAll(r5, r1, r4)
                if (r5 != r0) goto L4c
            L4b:
                return r0
            L4c:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.w.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((d) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runFallbackTransition$1", f = "TransitionWorker.kt", i = {0}, l = {72, 81, 83}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    static final class e extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58257n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private /* synthetic */ Object f58258o;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            e eVar = w.this.new e(continuation);
            eVar.f58258o = obj;
            return eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
        
            if (r1.emit(r2, r10) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
        
            if (r1.emit(r11, r10) == r0) goto L22;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f58257n
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L27
                if (r1 == r4) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1a
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                jn0.t.b(r11)
                goto L97
            L1f:
                java.lang.Object r1 = r10.f58258o
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                jn0.t.b(r11)
                goto L6a
            L27:
                jn0.t.b(r11)
                java.lang.Object r11 = r10.f58258o
                r1 = r11
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                com.withpersona.sdk2.inquiry.internal.w r11 = com.withpersona.sdk2.inquiry.internal.w.this
                mg0.a r11 = com.withpersona.sdk2.inquiry.internal.w.b(r11)
                com.withpersona.sdk2.inquiry.internal.w r5 = com.withpersona.sdk2.inquiry.internal.w.this
                java.lang.String r5 = r5.getSessionToken()
                com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest$a r6 = com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest.INSTANCE
                com.withpersona.sdk2.inquiry.internal.w r7 = com.withpersona.sdk2.inquiry.internal.w.this
                com.withpersona.sdk2.inquiry.internal.w$c r7 = com.withpersona.sdk2.inquiry.internal.w.e(r7)
                oi0.n5 r7 = r7.getFromComponent()
                com.withpersona.sdk2.inquiry.internal.w r8 = com.withpersona.sdk2.inquiry.internal.w.this
                com.withpersona.sdk2.inquiry.internal.w$c r8 = com.withpersona.sdk2.inquiry.internal.w.e(r8)
                java.util.Map r8 = r8.a()
                com.withpersona.sdk2.inquiry.internal.w r9 = com.withpersona.sdk2.inquiry.internal.w.this
                com.withpersona.sdk2.inquiry.internal.w$c r9 = com.withpersona.sdk2.inquiry.internal.w.e(r9)
                java.lang.String r9 = r9.getFromStep()
                com.withpersona.sdk2.inquiry.ui.network.TransitionInquiryRequest r6 = r6.a(r7, r8, r9)
                r10.f58258o = r1
                r10.f58257n = r4
                java.lang.Object r11 = r11.a(r5, r6, r10)
                if (r11 != r0) goto L6a
                goto L96
            L6a:
                retrofit2.y r11 = (retrofit2.y) r11
                boolean r4 = r11.g()
                r5 = 0
                if (r4 != 0) goto L87
                com.withpersona.sdk2.inquiry.internal.w$b$a r2 = new com.withpersona.sdk2.inquiry.internal.w$b$a
                com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo$NetworkErrorInfo r11 = com.withpersona.sdk2.inquiry.network.core.NetworkUtilsKt.toErrorInfo(r11)
                r2.<init>(r11)
                r10.f58258o = r5
                r10.f58257n = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto L97
                goto L96
            L87:
                com.withpersona.sdk2.inquiry.internal.w$b$b r11 = new com.withpersona.sdk2.inquiry.internal.w$b$b
                r11.<init>(r5)
                r10.f58258o = r5
                r10.f58257n = r2
                java.lang.Object r11 = r1.emit(r11, r10)
                if (r11 != r0) goto L97
            L96:
                return r0
            L97:
                jn0.h0 r11 = jn0.h0.f84049a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.w.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((e) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/inquiry/internal/w$b;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.internal.TransitionWorker$runTransition$1", f = "TransitionWorker.kt", i = {0, 2, 2}, l = {42, 52, 55, 67}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$1"})
    static final class f extends SuspendLambda implements wn0.p<FlowCollector<? super b>, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f58260n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f58261o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f58262p;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            f fVar = w.this.new f(continuation);
            fVar.f58262p = obj;
            return fVar;
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            if (r1.emit(r2, r14) == r0) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00f2, code lost:
        
            if (r3.emit(r1, r14) == r0) goto L35;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 256
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withpersona.sdk2.inquiry.internal.w.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(FlowCollector<? super b> flowCollector, Continuation<? super h0> continuation) {
            return ((f) create(flowCollector, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public w(String sessionToken, String inquiryId, InquirySessionConfig inquirySessionConfig, TransitionData transitionData, hh0.s service, mg0.a fallbackModeManager, t2 uiStepSavedStateHelper) {
        p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
        p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
        p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
        p013kotlin.jvm.internal.s.k(transitionData, "transitionData");
        p013kotlin.jvm.internal.s.k(service, "service");
        p013kotlin.jvm.internal.s.k(fallbackModeManager, "fallbackModeManager");
        p013kotlin.jvm.internal.s.k(uiStepSavedStateHelper, "uiStepSavedStateHelper");
        this.sessionToken = sessionToken;
        this.inquiryId = inquiryId;
        this.inquirySessionConfig = inquirySessionConfig;
        this.transitionData = transitionData;
        this.service = service;
        this.fallbackModeManager = fallbackModeManager;
        this.uiStepSavedStateHelper = uiStepSavedStateHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<b> k() {
        return FlowKt.flow(new e(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<b> l() {
        return FlowKt.flow(new f(null));
    }

    @Override // y20.o
    public boolean a(y20.o<?> oVar) {
        return y20.o.b.a(this, oVar);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getInquiryId() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSessionToken() {
        return this.sessionToken;
    }

    @Override // y20.o
    public Flow<b> run() {
        return FlowKt.flow(new d(null));
    }
}
