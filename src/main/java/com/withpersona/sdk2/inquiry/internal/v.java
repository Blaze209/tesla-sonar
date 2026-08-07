package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bh0.j2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v;", "Landroid/os/Parcelable;", "<init>", "()V", "b", DateTokenConverter.CONVERTER_KEY, "a", "c", "Lcom/withpersona/sdk2/inquiry/internal/v$a;", "Lcom/withpersona/sdk2/inquiry/internal/v$b;", "Lcom/withpersona/sdk2/inquiry/internal/v$c;", "Lcom/withpersona/sdk2/inquiry/internal/v$d;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class v implements Parcelable {

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$a;", "Lcom/withpersona/sdk2/inquiry/internal/v;", "Lbh0/j2;", "pollingMode", "", "canReuseWorkflow", "<init>", "(Lbh0/j2;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbh0/j2;", "b", "()Lbh0/j2;", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CheckingForNextState extends v {
        public static final Parcelable.Creator<CheckingForNextState> CREATOR = new C1189a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final j2 pollingMode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canReuseWorkflow;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1189a implements Parcelable.Creator<CheckingForNextState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CheckingForNextState createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CheckingForNextState(j2.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CheckingForNextState[] newArray(int i11) {
                return new CheckingForNextState[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CheckingForNextState() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanReuseWorkflow() {
            return this.canReuseWorkflow;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final j2 getPollingMode() {
            return this.pollingMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckingForNextState)) {
                return false;
            }
            CheckingForNextState checkingForNextState = (CheckingForNextState) other;
            return this.pollingMode == checkingForNextState.pollingMode && this.canReuseWorkflow == checkingForNextState.canReuseWorkflow;
        }

        public int hashCode() {
            return (this.pollingMode.hashCode() * 31) + Boolean.hashCode(this.canReuseWorkflow);
        }

        public String toString() {
            return "CheckingForNextState(pollingMode=" + this.pollingMode + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.pollingMode.name());
            dest.writeInt(this.canReuseWorkflow ? 1 : 0);
        }

        public /* synthetic */ CheckingForNextState(j2 j2Var, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? j2.Blocking : j2Var, (i11 & 2) != 0 ? false : z11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CheckingForNextState(j2 pollingMode, boolean z11) {
            super(null);
            p013kotlin.jvm.internal.s.k(pollingMode, "pollingMode");
            this.pollingMode = pollingMode;
            this.canReuseWorkflow = z11;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000eJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$b;", "Lcom/withpersona/sdk2/inquiry/internal/v;", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "transitionData", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/w$c;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/w$c;", "()Lcom/withpersona/sdk2/inquiry/internal/w$c;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Transitioning extends v {
        public static final Parcelable.Creator<Transitioning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final w.TransitionData transitionData;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Transitioning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Transitioning createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new Transitioning(w.TransitionData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Transitioning[] newArray(int i11) {
                return new Transitioning[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transitioning(w.TransitionData transitionData) {
            super(null);
            p013kotlin.jvm.internal.s.k(transitionData, "transitionData");
            this.transitionData = transitionData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w.TransitionData getTransitionData() {
            return this.transitionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transitioning) && p013kotlin.jvm.internal.s.f(this.transitionData, ((Transitioning) other).transitionData);
        }

        public int hashCode() {
            return this.transitionData.hashCode();
        }

        public String toString() {
            return "Transitioning(transitionData=" + this.transitionData + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            this.transitionData.writeToParcel(dest, flags);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$c;", "Lcom/withpersona/sdk2/inquiry/internal/v;", "<init>", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c extends v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f58239a = new c();
        public static final Parcelable.Creator<c> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                parcel.readInt();
                return c.f58239a;
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -593165066;
        }

        public String toString() {
            return "TransitioningBack";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$d, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/v$d;", "Lcom/withpersona/sdk2/inquiry/internal/v;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "nextStep", "", "canReuseWorkflow", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/l;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/internal/l;", "b", "()Lcom/withpersona/sdk2/inquiry/internal/l;", "Z", "()Z", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateInquirySession extends v {
        public static final Parcelable.Creator<UpdateInquirySession> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l nextStep;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean canReuseWorkflow;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.v$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UpdateInquirySession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new UpdateInquirySession((l) parcel.readParcelable(UpdateInquirySession.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UpdateInquirySession[] newArray(int i11) {
                return new UpdateInquirySession[i11];
            }
        }

        public UpdateInquirySession(l lVar, boolean z11) {
            super(null);
            this.nextStep = lVar;
            this.canReuseWorkflow = z11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanReuseWorkflow() {
            return this.canReuseWorkflow;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final l getNextStep() {
            return this.nextStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateInquirySession)) {
                return false;
            }
            UpdateInquirySession updateInquirySession = (UpdateInquirySession) other;
            return p013kotlin.jvm.internal.s.f(this.nextStep, updateInquirySession.nextStep) && this.canReuseWorkflow == updateInquirySession.canReuseWorkflow;
        }

        public int hashCode() {
            l lVar = this.nextStep;
            return ((lVar == null ? 0 : lVar.hashCode()) * 31) + Boolean.hashCode(this.canReuseWorkflow);
        }

        public String toString() {
            return "UpdateInquirySession(nextStep=" + this.nextStep + ", canReuseWorkflow=" + this.canReuseWorkflow + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeParcelable(this.nextStep, flags);
            dest.writeInt(this.canReuseWorkflow ? 1 : 0);
        }
    }

    public /* synthetic */ v(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private v() {
    }
}
