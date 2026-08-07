package com.withpersona.sdk2.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import bh0.r2;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.StaticInquiryTemplate;
import com.withpersona.sdk2.inquiry.network.core.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.PendingPageTextPosition;
import com.withpersona.sdk2.inquiry.network.dto.government_id.CaptureOptionNativeMobile;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StyleElements;
import ezvcard.property.Gender;
import hi0.InquirySessionConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import th0.PoseConfigs;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\f\u0016.\u001f\u0018/'0\u00101\u001a\"\u0012B[\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0012\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R(\u0010-\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b'\u0010(\u0012\u0004\b+\u0010,\u001a\u0004\b\u0016\u0010)\"\u0004\b\u001f\u0010*\u0082\u0001\f23456789:;<=¨\u0006>"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l;", "Landroid/os/Parcelable;", "", "sessionToken", "inquiryId", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "fromStep", "Lhi0/g;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Lhi0/g;)V", "f", "(Lcom/withpersona/sdk2/inquiry/internal/v;)Lcom/withpersona/sdk2/inquiry/internal/l;", "a", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "b", "q", "c", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "e", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "g", "Lhi0/g;", "r", "()Lhi0/g;", "", "h", "Z", "()Z", "(Z)V", "getDidGoBack$annotations", "()V", "didGoBack", IntegerTokenConverter.CONVERTER_KEY, "k", "l", "j", "Lcom/withpersona/sdk2/inquiry/internal/l$a;", "Lcom/withpersona/sdk2/inquiry/internal/l$b;", "Lcom/withpersona/sdk2/inquiry/internal/l$c;", "Lcom/withpersona/sdk2/inquiry/internal/l$d;", "Lcom/withpersona/sdk2/inquiry/internal/l$e;", "Lcom/withpersona/sdk2/inquiry/internal/l$f;", "Lcom/withpersona/sdk2/inquiry/internal/l$g;", "Lcom/withpersona/sdk2/inquiry/internal/l$h;", "Lcom/withpersona/sdk2/inquiry/internal/l$i;", "Lcom/withpersona/sdk2/inquiry/internal/l$j;", "Lcom/withpersona/sdk2/inquiry/internal/l$k;", "Lcom/withpersona/sdk2/inquiry/internal/l$l;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class l implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sessionToken;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String inquiryId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v transitionStatus;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final StepStyle styles;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NextStep.CancelDialog cancelDialog;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fromStep;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InquirySessionConfig inquirySessionConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean didGoBack;

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015JP\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010!\u001a\u0004\b#\u0010\u0019R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b \u0010,¨\u0006-"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$a;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "inquiryStatus", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/internal/l$a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "m", "Ljava/util/Map;", "()Ljava/util/Map;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Complete extends l {
        public static final Parcelable.Creator<Complete> CREATOR = new C1179a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryStatus;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class C1179a implements Parcelable.Creator<Complete> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Complete createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                v vVar = (v) parcel.readParcelable(Complete.class.getClassLoader());
                String string3 = parcel.readString();
                int i11 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(Complete.class.getClassLoader()));
                }
                return new Complete(string, string2, vVar, string3, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Complete[] newArray(int i11) {
                return new Complete[i11];
            }
        }

        public /* synthetic */ Complete(String str, String str2, v vVar, String str3, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : vVar, str3, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Complete h(Complete complete, String str, String str2, v vVar, String str3, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = complete.inquiryId;
            }
            if ((i11 & 2) != 0) {
                str2 = complete.sessionToken;
            }
            if ((i11 & 4) != 0) {
                vVar = complete.transitionStatus;
            }
            if ((i11 & 8) != 0) {
                str3 = complete.inquiryStatus;
            }
            if ((i11 & 16) != 0) {
                map = complete.fields;
            }
            Map map2 = map;
            v vVar2 = vVar;
            return complete.g(str, str2, vVar2, str3, map2);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Complete)) {
                return false;
            }
            Complete complete = (Complete) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, complete.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, complete.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, complete.transitionStatus) && p013kotlin.jvm.internal.s.f(this.inquiryStatus, complete.inquiryStatus) && p013kotlin.jvm.internal.s.f(this.fields, complete.fields);
        }

        public final Complete g(String inquiryId, String sessionToken, v transitionStatus, String inquiryStatus, Map<String, ? extends InquiryField> fields) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(fields, "fields");
            return new Complete(inquiryId, sessionToken, transitionStatus, inquiryStatus, fields);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            return ((((iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.fields.hashCode();
        }

        public final Map<String, InquiryField> i() {
            return this.fields;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public String toString() {
            return "Complete(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryStatus=" + this.inquiryStatus + ", fields=" + this.fields + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryStatus);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Complete(String inquiryId, String sessionToken, v vVar, String inquiryStatus, Map<String, ? extends InquiryField> fields) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(fields, "fields");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.inquiryStatus = inquiryStatus;
            this.fields = fields;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b&\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b'\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b$\u0010\u001aR%\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b!\u0010+R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b(\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$b;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "templateId", "templateVersion", "accountId", "environmentId", "referenceId", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "themeSetId", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "staticInquiryTemplate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "k", "j", "l", "g", "h", "m", "n", "Ljava/util/Map;", "()Ljava/util/Map;", "o", "p", "Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "getStaticInquiryTemplate", "()Lcom/withpersona/sdk2/inquiry/StaticInquiryTemplate;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateInquiryFromTemplate extends l {
        public static final Parcelable.Creator<CreateInquiryFromTemplate> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String templateId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String templateVersion;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountId;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String environmentId;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final String referenceId;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String themeSetId;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final StaticInquiryTemplate staticInquiryTemplate;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquiryFromTemplate> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i11 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap.put(parcel.readString(), parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
                    }
                }
                return new CreateInquiryFromTemplate(string, string2, string3, string4, string5, linkedHashMap, parcel.readString(), (StaticInquiryTemplate) parcel.readParcelable(CreateInquiryFromTemplate.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquiryFromTemplate[] newArray(int i11) {
                return new CreateInquiryFromTemplate[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CreateInquiryFromTemplate(String str, String str2, String str3, String str4, String str5, Map<String, ? extends InquiryField> map, String str6, StaticInquiryTemplate staticInquiryTemplate) {
            super(null, null, null, null, null, null, null, 127, null);
            this.templateId = str;
            this.templateVersion = str2;
            this.accountId = str3;
            this.environmentId = str4;
            this.referenceId = str5;
            this.fields = map;
            this.themeSetId = str6;
            this.staticInquiryTemplate = staticInquiryTemplate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateInquiryFromTemplate)) {
                return false;
            }
            CreateInquiryFromTemplate createInquiryFromTemplate = (CreateInquiryFromTemplate) other;
            return p013kotlin.jvm.internal.s.f(this.templateId, createInquiryFromTemplate.templateId) && p013kotlin.jvm.internal.s.f(this.templateVersion, createInquiryFromTemplate.templateVersion) && p013kotlin.jvm.internal.s.f(this.accountId, createInquiryFromTemplate.accountId) && p013kotlin.jvm.internal.s.f(this.environmentId, createInquiryFromTemplate.environmentId) && p013kotlin.jvm.internal.s.f(this.referenceId, createInquiryFromTemplate.referenceId) && p013kotlin.jvm.internal.s.f(this.fields, createInquiryFromTemplate.fields) && p013kotlin.jvm.internal.s.f(this.themeSetId, createInquiryFromTemplate.themeSetId) && p013kotlin.jvm.internal.s.f(this.staticInquiryTemplate, createInquiryFromTemplate.staticInquiryTemplate);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getEnvironmentId() {
            return this.environmentId;
        }

        public int hashCode() {
            String str = this.templateId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.templateVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.accountId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.environmentId;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.referenceId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Map<String, InquiryField> map = this.fields;
            int iHashCode6 = (iHashCode5 + (map == null ? 0 : map.hashCode())) * 31;
            String str6 = this.themeSetId;
            int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            StaticInquiryTemplate staticInquiryTemplate = this.staticInquiryTemplate;
            return iHashCode7 + (staticInquiryTemplate != null ? staticInquiryTemplate.hashCode() : 0);
        }

        public final Map<String, InquiryField> i() {
            return this.fields;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getReferenceId() {
            return this.referenceId;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getTemplateVersion() {
            return this.templateVersion;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getThemeSetId() {
            return this.themeSetId;
        }

        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.templateId + ", templateVersion=" + this.templateVersion + ", accountId=" + this.accountId + ", environmentId=" + this.environmentId + ", referenceId=" + this.referenceId + ", fields=" + this.fields + ", themeSetId=" + this.themeSetId + ", staticInquiryTemplate=" + this.staticInquiryTemplate + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.templateId);
            dest.writeString(this.templateVersion);
            dest.writeString(this.accountId);
            dest.writeString(this.environmentId);
            dest.writeString(this.referenceId);
            Map<String, InquiryField> map = this.fields;
            if (map == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(map.size());
                for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                    dest.writeString(entry.getKey());
                    dest.writeParcelable(entry.getValue(), flags);
                }
            }
            dest.writeString(this.themeSetId);
            dest.writeParcelable(this.staticInquiryTemplate, flags);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$c, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$c;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "inquiryId", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CreateInquirySession extends l {
        public static final Parcelable.Creator<CreateInquirySession> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$c$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CreateInquirySession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new CreateInquirySession(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CreateInquirySession[] newArray(int i11) {
                return new CreateInquirySession[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateInquirySession(String inquiryId) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            this.inquiryId = inquiryId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateInquirySession) && p013kotlin.jvm.internal.s.f(this.inquiryId, ((CreateInquirySession) other).inquiryId);
        }

        public int hashCode() {
            return this.inquiryId.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.inquiryId + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$d, reason: from toString */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Ba\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001eJ|\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\"R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00106\u001a\u0004\b7\u00108R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b,\u0010;R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010\"R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b2\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\b)\u0010@R\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010*\u001a\u0004\bB\u0010\"¨\u0006C"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$d;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lbh0/r2;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "documentStep", "fromComponent", "Lig0/l;", "pages", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "assetConfig", "fromStep", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lig0/l;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;Ljava/lang/String;Lig0/l;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/l$d;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "m", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document;", "p", "Lig0/l;", "()Lig0/l;", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;", "r", "c", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DocumentStepRunning extends l implements r2 {
        public static final Parcelable.Creator<DocumentStepRunning> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.DocumentStepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Document documentStep;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromComponent;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final ig0.l pages;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Document.AssetConfig assetConfig;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$d$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DocumentStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new DocumentStepRunning(parcel.readString(), parcel.readString(), (v) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (StepStyles.DocumentStepStyle) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString(), (ig0.l) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), (NextStep.Document.AssetConfig) parcel.readParcelable(DocumentStepRunning.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final DocumentStepRunning[] newArray(int i11) {
                return new DocumentStepRunning[i11];
            }
        }

        public /* synthetic */ DocumentStepRunning(String str, String str2, v vVar, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, ig0.l lVar, NextStep.Document.AssetConfig assetConfig, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : vVar, documentStepStyle, cancelDialog, document, str3, lVar, assetConfig, str4);
        }

        public static /* synthetic */ DocumentStepRunning h(DocumentStepRunning documentStepRunning, String str, String str2, v vVar, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document document, String str3, ig0.l lVar, NextStep.Document.AssetConfig assetConfig, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = documentStepRunning.inquiryId;
            }
            if ((i11 & 2) != 0) {
                str2 = documentStepRunning.sessionToken;
            }
            if ((i11 & 4) != 0) {
                vVar = documentStepRunning.transitionStatus;
            }
            if ((i11 & 8) != 0) {
                documentStepStyle = documentStepRunning.styles;
            }
            if ((i11 & 16) != 0) {
                cancelDialog = documentStepRunning.cancelDialog;
            }
            if ((i11 & 32) != 0) {
                document = documentStepRunning.documentStep;
            }
            if ((i11 & 64) != 0) {
                str3 = documentStepRunning.fromComponent;
            }
            if ((i11 & 128) != 0) {
                lVar = documentStepRunning.pages;
            }
            if ((i11 & 256) != 0) {
                assetConfig = documentStepRunning.assetConfig;
            }
            if ((i11 & 512) != 0) {
                str4 = documentStepRunning.fromStep;
            }
            NextStep.Document.AssetConfig assetConfig2 = assetConfig;
            String str5 = str4;
            String str6 = str3;
            ig0.l lVar2 = lVar;
            NextStep.CancelDialog cancelDialog2 = cancelDialog;
            NextStep.Document document2 = document;
            return documentStepRunning.g(str, str2, vVar, documentStepStyle, cancelDialog2, document2, str6, lVar2, assetConfig2, str5);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DocumentStepRunning)) {
                return false;
            }
            DocumentStepRunning documentStepRunning = (DocumentStepRunning) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, documentStepRunning.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, documentStepRunning.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, documentStepRunning.transitionStatus) && p013kotlin.jvm.internal.s.f(this.styles, documentStepRunning.styles) && p013kotlin.jvm.internal.s.f(this.cancelDialog, documentStepRunning.cancelDialog) && p013kotlin.jvm.internal.s.f(this.documentStep, documentStepRunning.documentStep) && p013kotlin.jvm.internal.s.f(this.fromComponent, documentStepRunning.fromComponent) && p013kotlin.jvm.internal.s.f(this.pages, documentStepRunning.pages) && p013kotlin.jvm.internal.s.f(this.assetConfig, documentStepRunning.assetConfig) && p013kotlin.jvm.internal.s.f(this.fromStep, documentStepRunning.fromStep);
        }

        public final DocumentStepRunning g(String inquiryId, String sessionToken, v transitionStatus, StepStyles.DocumentStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Document documentStep, String fromComponent, ig0.l pages, NextStep.Document.AssetConfig assetConfig, String fromStep) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(documentStep, "documentStep");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(pages, "pages");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            return new DocumentStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, documentStep, fromComponent, pages, assetConfig, fromStep);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
            StepStyles.DocumentStepStyle documentStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (documentStepStyle == null ? 0 : documentStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.documentStep.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.pages.hashCode()) * 31;
            NextStep.Document.AssetConfig assetConfig = this.assetConfig;
            return ((iHashCode4 + (assetConfig != null ? assetConfig.hashCode() : 0)) * 31) + this.fromStep.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final NextStep.Document.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final NextStep.Document getDocumentStep() {
            return this.documentStep;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ig0.l getPages() {
            return this.pages;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: m, reason: from getter */
        public StepStyles.DocumentStepStyle getStyles() {
            return this.styles;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        public String toString() {
            return "DocumentStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", documentStep=" + this.documentStep + ", fromComponent=" + this.fromComponent + ", pages=" + this.pages + ", assetConfig=" + this.assetConfig + ", fromStep=" + this.fromStep + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.documentStep, flags);
            dest.writeString(this.fromComponent);
            dest.writeParcelable(this.pages, flags);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.fromStep);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentStepRunning(String inquiryId, String sessionToken, v vVar, StepStyles.DocumentStepStyle documentStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Document documentStep, String fromComponent, ig0.l pages, NextStep.Document.AssetConfig assetConfig, String fromStep) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(documentStep, "documentStep");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(pages, "pages");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.styles = documentStepStyle;
            this.cancelDialog = cancelDialog;
            this.documentStep = documentStep;
            this.fromComponent = fromComponent;
            this.pages = pages;
            this.assetConfig = assetConfig;
            this.fromStep = fromStep;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$e, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000eJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$e;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "oneTimeLinkCode", "<init>", "(Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExchangeOneTimeCode extends l {
        public static final Parcelable.Creator<ExchangeOneTimeCode> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String oneTimeLinkCode;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$e$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExchangeOneTimeCode> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ExchangeOneTimeCode(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ExchangeOneTimeCode[] newArray(int i11) {
                return new ExchangeOneTimeCode[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExchangeOneTimeCode(String oneTimeLinkCode) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(oneTimeLinkCode, "oneTimeLinkCode");
            this.oneTimeLinkCode = oneTimeLinkCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExchangeOneTimeCode) && p013kotlin.jvm.internal.s.f(this.oneTimeLinkCode, ((ExchangeOneTimeCode) other).oneTimeLinkCode);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getOneTimeLinkCode() {
            return this.oneTimeLinkCode;
        }

        public int hashCode() {
            return this.oneTimeLinkCode.hashCode();
        }

        public String toString() {
            return "ExchangeOneTimeCode(oneTimeLinkCode=" + this.oneTimeLinkCode + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.oneTimeLinkCode);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$f, reason: from toString */
    @Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0097\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0012\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0012\u0012\b\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103J\u001d\u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u001b¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u001b¢\u0006\u0004\b:\u0010;JÖ\u0002\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00122\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010/\u001a\u00020\u00122\n\b\u0002\u00101\u001a\u0004\u0018\u000100HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b@\u0010;J\u001a\u0010C\u001a\u00020\u00122\b\u0010B\u001a\u0004\u0018\u00010AHÖ\u0003¢\u0006\u0004\bC\u0010DR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010?R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\bI\u0010?R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bV\u0010F\u001a\u0004\bW\u0010?R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bI\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b[\u0010F\u001a\u0004\b\\\u0010?R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\b]\u0010?R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\bN\u0010`R\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\ba\u0010_\u001a\u0004\bR\u0010`R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bf\u0010X\u001a\u0004\bg\u0010ZR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\r8\u0006¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bh\u0010ZR\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\bY\u0010i\u001a\u0004\bj\u0010;R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010\u001f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bo\u0010F\u001a\u0004\bk\u0010?R\u0017\u0010 \u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\\\u0010F\u001a\u0004\bo\u0010?R\u0017\u0010!\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bj\u0010_\u001a\u0004\bp\u0010`R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\r8\u0006¢\u0006\f\n\u0004\bq\u0010X\u001a\u0004\bf\u0010ZR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\r8\u0006¢\u0006\f\n\u0004\br\u0010X\u001a\u0004\bs\u0010ZR\u0019\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bg\u0010F\u001a\u0004\bt\u0010?R\u0019\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\f\n\u0004\bd\u0010u\u001a\u0004\bE\u0010vR\u0017\u0010*\u001a\u00020)8\u0006¢\u0006\f\n\u0004\bm\u0010w\u001a\u0004\bJ\u0010xR\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u0017\u0010.\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b}\u0010~\u001a\u0004\by\u0010\u007fR\u0017\u0010/\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bi\u0010_\u001a\u0004\bH\u0010`R\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\bl\u0010\u0080\u0001\u001a\u0005\ba\u0010\u0081\u0001¨\u0006\u0082\u0001"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$f;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lbh0/r2;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/Id;", "enabledIdClasses", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "localizations", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$LocalizationOverride;", "localizationOverrides", "Lcom/withpersona/sdk2/inquiry/network/dto/government_id/CaptureOptionNativeMobile;", "enabledCaptureOptionsNativeMobile", "", "imageCaptureCount", "", "manualCaptureButtonDelayMs", "fieldKeyDocument", "fieldKeyIdClass", "shouldSkipReviewScreen", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$VideoCaptureMethod;", "videoCaptureMethods", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "assetConfig", "Lqg0/a;", "autoClassificationConfig", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "reviewCaptureButtonsAxis", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lug0/a;", "digitalIdConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lqg0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLug0/a;)V", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;Ljava/util/List;Ljava/util/List;IJLjava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;Lqg0/a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLug0/a;)Lcom/withpersona/sdk2/inquiry/internal/l$f;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", Gender.MALE, "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "n", "getCountryCode", "Ljava/util/List;", "w", "()Ljava/util/List;", "p", "z", "c", "r", "Z", "()Z", "s", "t", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "E", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$Localizations;", "u", "D", "v", "I", "A", "x", "J", Gender.FEMALE, "()J", "y", "L", "B", "C", Gender.NONE, Gender.OTHER, "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;", "Lqg0/a;", "()Lqg0/a;", "G", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "K", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;", "H", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "Lug0/a;", "()Lug0/a;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GovernmentIdStepRunning extends l implements r2 {
        public static final Parcelable.Creator<GovernmentIdStepRunning> CREATOR = new a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final boolean shouldSkipReviewScreen;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final List<NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final List<NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final String webRtcJwt;

        /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
        private final NextStep.GovernmentId.AssetConfig assetConfig;

        /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
        private final qg0.a autoClassificationConfig;

        /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
        private final StyleElements.Axis reviewCaptureButtonsAxis;

        /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
        private final boolean audioEnabled;

        /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
        private final ug0.a digitalIdConfig;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.GovernmentIdStepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String countryCode;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Id> enabledIdClasses;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromComponent;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.GovernmentId.Localizations localizations;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final int imageCaptureCount;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final long manualCaptureButtonDelayMs;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldKeyDocument;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldKeyIdClass;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$f$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GovernmentIdStepRunning> {
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v12 */
            /* JADX WARN: Type inference failed for: r2v13, types: [int] */
            /* JADX WARN: Type inference failed for: r2v20 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v2, types: [int] */
            /* JADX WARN: Type inference failed for: r3v6 */
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                Class cls;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                v vVar = (v) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                StepStyles.GovernmentIdStepStyle governmentIdStepStyle = (StepStyles.GovernmentIdStepStyle) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                String string3 = parcel.readString();
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList2.add(parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader()));
                }
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z11 = true;
                boolean z12 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                NextStep.GovernmentId.Localizations localizations = (NextStep.GovernmentId.Localizations) parcel.readParcelable(GovernmentIdStepRunning.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    cls = GovernmentIdStepRunning.class;
                    arrayList = null;
                } else {
                    int i13 = parcel.readInt();
                    arrayList = new ArrayList(i13);
                    cls = GovernmentIdStepRunning.class;
                    for (int i14 = 0; i14 != i13; i14++) {
                        arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                    }
                }
                int i15 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i15);
                int i16 = 0;
                while (i16 != i15) {
                    arrayList3.add(CaptureOptionNativeMobile.valueOf(parcel.readString()));
                    i16++;
                    i15 = i15;
                }
                int i17 = parcel.readInt();
                Class cls2 = cls;
                long j11 = parcel.readLong();
                String string6 = parcel.readString();
                boolean z13 = false;
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                int i18 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i18);
                for (?? r11 = z13; r11 != i18; r11++) {
                    arrayList4.add(NextStep.GovernmentId.CaptureFileType.valueOf(parcel.readString()));
                    i18 = i18;
                }
                int i19 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i19);
                for (?? r12 = z13; r12 != i19; r12++) {
                    arrayList5.add(NextStep.GovernmentId.VideoCaptureMethod.valueOf(parcel.readString()));
                    i19 = i19;
                }
                return new GovernmentIdStepRunning(string, string2, vVar, governmentIdStepStyle, cancelDialog, string3, arrayList2, string4, string5, z12, z11, localizations, arrayList, arrayList3, i17, j11, string6, string7, z13, arrayList4, arrayList5, parcel.readString(), (NextStep.GovernmentId.AssetConfig) parcel.readParcelable(cls2.getClassLoader()), (qg0.a) parcel.readParcelable(cls2.getClassLoader()), StyleElements.Axis.valueOf(parcel.readString()), PendingPageTextPosition.valueOf(parcel.readString()), parcel.readInt() != 0, (ug0.a) parcel.readParcelable(cls2.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final GovernmentIdStepRunning[] newArray(int i11) {
                return new GovernmentIdStepRunning[i11];
            }
        }

        public /* synthetic */ GovernmentIdStepRunning(String str, String str2, v vVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z11, boolean z12, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i11, long j11, String str6, String str7, boolean z13, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, qg0.a aVar, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z14, ug0.a aVar2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i12 & 4) != 0 ? null : vVar, governmentIdStepStyle, cancelDialog, str3, list, str4, str5, z11, z12, localizations, list2, list3, i11, j11, str6, str7, z13, list4, list5, str8, assetConfig, aVar, axis, pendingPageTextPosition, z14, aVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GovernmentIdStepRunning h(GovernmentIdStepRunning governmentIdStepRunning, String str, String str2, v vVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str3, List list, String str4, String str5, boolean z11, boolean z12, NextStep.GovernmentId.Localizations localizations, List list2, List list3, int i11, long j11, String str6, String str7, boolean z13, List list4, List list5, String str8, NextStep.GovernmentId.AssetConfig assetConfig, qg0.a aVar, StyleElements.Axis axis, PendingPageTextPosition pendingPageTextPosition, boolean z14, ug0.a aVar2, int i12, Object obj) {
            ug0.a aVar3;
            boolean z15;
            String str9 = (i12 & 1) != 0 ? governmentIdStepRunning.inquiryId : str;
            String str10 = (i12 & 2) != 0 ? governmentIdStepRunning.sessionToken : str2;
            v vVar2 = (i12 & 4) != 0 ? governmentIdStepRunning.transitionStatus : vVar;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle2 = (i12 & 8) != 0 ? governmentIdStepRunning.styles : governmentIdStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i12 & 16) != 0 ? governmentIdStepRunning.cancelDialog : cancelDialog;
            String str11 = (i12 & 32) != 0 ? governmentIdStepRunning.countryCode : str3;
            List list6 = (i12 & 64) != 0 ? governmentIdStepRunning.enabledIdClasses : list;
            String str12 = (i12 & 128) != 0 ? governmentIdStepRunning.fromComponent : str4;
            String str13 = (i12 & 256) != 0 ? governmentIdStepRunning.fromStep : str5;
            boolean z16 = (i12 & 512) != 0 ? governmentIdStepRunning.backStepEnabled : z11;
            boolean z17 = (i12 & 1024) != 0 ? governmentIdStepRunning.cancelButtonEnabled : z12;
            NextStep.GovernmentId.Localizations localizations2 = (i12 & 2048) != 0 ? governmentIdStepRunning.localizations : localizations;
            List list7 = (i12 & 4096) != 0 ? governmentIdStepRunning.localizationOverrides : list2;
            List list8 = (i12 & PKIFailureInfo.certRevoked) != 0 ? governmentIdStepRunning.enabledCaptureOptionsNativeMobile : list3;
            String str14 = str9;
            int i13 = (i12 & 16384) != 0 ? governmentIdStepRunning.imageCaptureCount : i11;
            long j12 = (i12 & 32768) != 0 ? governmentIdStepRunning.manualCaptureButtonDelayMs : j11;
            String str15 = (i12 & 65536) != 0 ? governmentIdStepRunning.fieldKeyDocument : str6;
            String str16 = (i12 & 131072) != 0 ? governmentIdStepRunning.fieldKeyIdClass : str7;
            String str17 = str15;
            boolean z18 = (i12 & 262144) != 0 ? governmentIdStepRunning.shouldSkipReviewScreen : z13;
            List list9 = (i12 & PKIFailureInfo.signerNotTrusted) != 0 ? governmentIdStepRunning.enabledCaptureFileTypes : list4;
            List list10 = (i12 & PKIFailureInfo.badCertTemplate) != 0 ? governmentIdStepRunning.videoCaptureMethods : list5;
            String str18 = (i12 & PKIFailureInfo.badSenderNonce) != 0 ? governmentIdStepRunning.webRtcJwt : str8;
            NextStep.GovernmentId.AssetConfig assetConfig2 = (i12 & 4194304) != 0 ? governmentIdStepRunning.assetConfig : assetConfig;
            qg0.a aVar4 = (i12 & 8388608) != 0 ? governmentIdStepRunning.autoClassificationConfig : aVar;
            StyleElements.Axis axis2 = (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? governmentIdStepRunning.reviewCaptureButtonsAxis : axis;
            PendingPageTextPosition pendingPageTextPosition2 = (i12 & 33554432) != 0 ? governmentIdStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z19 = (i12 & 67108864) != 0 ? governmentIdStepRunning.audioEnabled : z14;
            if ((i12 & 134217728) != 0) {
                z15 = z19;
                aVar3 = governmentIdStepRunning.digitalIdConfig;
            } else {
                aVar3 = aVar2;
                z15 = z19;
            }
            return governmentIdStepRunning.g(str14, str10, vVar2, governmentIdStepStyle2, cancelDialog2, str11, list6, str12, str13, z16, z17, localizations2, list7, list8, i13, j12, str17, str16, z18, list9, list10, str18, assetConfig2, aVar4, axis2, pendingPageTextPosition2, z15, aVar3);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final int getImageCaptureCount() {
            return this.imageCaptureCount;
        }

        public final List<NextStep.GovernmentId.LocalizationOverride> D() {
            return this.localizationOverrides;
        }

        /* JADX INFO: renamed from: E, reason: from getter */
        public final NextStep.GovernmentId.Localizations getLocalizations() {
            return this.localizations;
        }

        /* JADX INFO: renamed from: F, reason: from getter */
        public final long getManualCaptureButtonDelayMs() {
            return this.manualCaptureButtonDelayMs;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: K, reason: from getter */
        public final StyleElements.Axis getReviewCaptureButtonsAxis() {
            return this.reviewCaptureButtonsAxis;
        }

        /* JADX INFO: renamed from: L, reason: from getter */
        public final boolean getShouldSkipReviewScreen() {
            return this.shouldSkipReviewScreen;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: M, reason: from getter */
        public StepStyles.GovernmentIdStepStyle getStyles() {
            return this.styles;
        }

        public final List<NextStep.GovernmentId.VideoCaptureMethod> N() {
            return this.videoCaptureMethods;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GovernmentIdStepRunning)) {
                return false;
            }
            GovernmentIdStepRunning governmentIdStepRunning = (GovernmentIdStepRunning) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, governmentIdStepRunning.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, governmentIdStepRunning.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, governmentIdStepRunning.transitionStatus) && p013kotlin.jvm.internal.s.f(this.styles, governmentIdStepRunning.styles) && p013kotlin.jvm.internal.s.f(this.cancelDialog, governmentIdStepRunning.cancelDialog) && p013kotlin.jvm.internal.s.f(this.countryCode, governmentIdStepRunning.countryCode) && p013kotlin.jvm.internal.s.f(this.enabledIdClasses, governmentIdStepRunning.enabledIdClasses) && p013kotlin.jvm.internal.s.f(this.fromComponent, governmentIdStepRunning.fromComponent) && p013kotlin.jvm.internal.s.f(this.fromStep, governmentIdStepRunning.fromStep) && this.backStepEnabled == governmentIdStepRunning.backStepEnabled && this.cancelButtonEnabled == governmentIdStepRunning.cancelButtonEnabled && p013kotlin.jvm.internal.s.f(this.localizations, governmentIdStepRunning.localizations) && p013kotlin.jvm.internal.s.f(this.localizationOverrides, governmentIdStepRunning.localizationOverrides) && p013kotlin.jvm.internal.s.f(this.enabledCaptureOptionsNativeMobile, governmentIdStepRunning.enabledCaptureOptionsNativeMobile) && this.imageCaptureCount == governmentIdStepRunning.imageCaptureCount && this.manualCaptureButtonDelayMs == governmentIdStepRunning.manualCaptureButtonDelayMs && p013kotlin.jvm.internal.s.f(this.fieldKeyDocument, governmentIdStepRunning.fieldKeyDocument) && p013kotlin.jvm.internal.s.f(this.fieldKeyIdClass, governmentIdStepRunning.fieldKeyIdClass) && this.shouldSkipReviewScreen == governmentIdStepRunning.shouldSkipReviewScreen && p013kotlin.jvm.internal.s.f(this.enabledCaptureFileTypes, governmentIdStepRunning.enabledCaptureFileTypes) && p013kotlin.jvm.internal.s.f(this.videoCaptureMethods, governmentIdStepRunning.videoCaptureMethods) && p013kotlin.jvm.internal.s.f(this.webRtcJwt, governmentIdStepRunning.webRtcJwt) && p013kotlin.jvm.internal.s.f(this.assetConfig, governmentIdStepRunning.assetConfig) && p013kotlin.jvm.internal.s.f(this.autoClassificationConfig, governmentIdStepRunning.autoClassificationConfig) && this.reviewCaptureButtonsAxis == governmentIdStepRunning.reviewCaptureButtonsAxis && this.pendingPageTextVerticalPosition == governmentIdStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == governmentIdStepRunning.audioEnabled && p013kotlin.jvm.internal.s.f(this.digitalIdConfig, governmentIdStepRunning.digitalIdConfig);
        }

        public final GovernmentIdStepRunning g(String inquiryId, String sessionToken, v transitionStatus, StepStyles.GovernmentIdStepStyle styles, NextStep.CancelDialog cancelDialog, String countryCode, List<Id> enabledIdClasses, String fromComponent, String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> localizationOverrides, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int imageCaptureCount, long manualCaptureButtonDelayMs, String fieldKeyDocument, String fieldKeyIdClass, boolean shouldSkipReviewScreen, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, String webRtcJwt, NextStep.GovernmentId.AssetConfig assetConfig, qg0.a autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, ug0.a digitalIdConfig) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(enabledIdClasses, "enabledIdClasses");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(localizations, "localizations");
            p013kotlin.jvm.internal.s.k(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            p013kotlin.jvm.internal.s.k(fieldKeyDocument, "fieldKeyDocument");
            p013kotlin.jvm.internal.s.k(fieldKeyIdClass, "fieldKeyIdClass");
            p013kotlin.jvm.internal.s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            p013kotlin.jvm.internal.s.k(videoCaptureMethods, "videoCaptureMethods");
            p013kotlin.jvm.internal.s.k(autoClassificationConfig, "autoClassificationConfig");
            p013kotlin.jvm.internal.s.k(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            return new GovernmentIdStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, countryCode, enabledIdClasses, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, localizations, localizationOverrides, enabledCaptureOptionsNativeMobile, imageCaptureCount, manualCaptureButtonDelayMs, fieldKeyDocument, fieldKeyIdClass, shouldSkipReviewScreen, enabledCaptureFileTypes, videoCaptureMethods, webRtcJwt, assetConfig, autoClassificationConfig, reviewCaptureButtonsAxis, pendingPageTextVerticalPosition, audioEnabled, digitalIdConfig);
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
            StepStyles.GovernmentIdStepStyle governmentIdStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (governmentIdStepStyle == null ? 0 : governmentIdStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            String str = this.countryCode;
            int iHashCode5 = (((((((((((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.enabledIdClasses.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.localizations.hashCode()) * 31;
            List<NextStep.GovernmentId.LocalizationOverride> list = this.localizationOverrides;
            int iHashCode6 = (((((((((((((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.enabledCaptureOptionsNativeMobile.hashCode()) * 31) + Integer.hashCode(this.imageCaptureCount)) * 31) + Long.hashCode(this.manualCaptureButtonDelayMs)) * 31) + this.fieldKeyDocument.hashCode()) * 31) + this.fieldKeyIdClass.hashCode()) * 31) + Boolean.hashCode(this.shouldSkipReviewScreen)) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            String str2 = this.webRtcJwt;
            int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
            NextStep.GovernmentId.AssetConfig assetConfig = this.assetConfig;
            int iHashCode8 = (((((((((iHashCode7 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31) + this.autoClassificationConfig.hashCode()) * 31) + this.reviewCaptureButtonsAxis.hashCode()) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31;
            ug0.a aVar = this.digitalIdConfig;
            return iHashCode8 + (aVar != null ? aVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final NextStep.GovernmentId.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final qg0.a getAutoClassificationConfig() {
            return this.autoClassificationConfig;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final ug0.a getDigitalIdConfig() {
            return this.digitalIdConfig;
        }

        public String toString() {
            return "GovernmentIdStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", countryCode=" + this.countryCode + ", enabledIdClasses=" + this.enabledIdClasses + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", localizations=" + this.localizations + ", localizationOverrides=" + this.localizationOverrides + ", enabledCaptureOptionsNativeMobile=" + this.enabledCaptureOptionsNativeMobile + ", imageCaptureCount=" + this.imageCaptureCount + ", manualCaptureButtonDelayMs=" + this.manualCaptureButtonDelayMs + ", fieldKeyDocument=" + this.fieldKeyDocument + ", fieldKeyIdClass=" + this.fieldKeyIdClass + ", shouldSkipReviewScreen=" + this.shouldSkipReviewScreen + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", webRtcJwt=" + this.webRtcJwt + ", assetConfig=" + this.assetConfig + ", autoClassificationConfig=" + this.autoClassificationConfig + ", reviewCaptureButtonsAxis=" + this.reviewCaptureButtonsAxis + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", digitalIdConfig=" + this.digitalIdConfig + ")";
        }

        public final List<NextStep.GovernmentId.CaptureFileType> u() {
            return this.enabledCaptureFileTypes;
        }

        public final List<CaptureOptionNativeMobile> v() {
            return this.enabledCaptureOptionsNativeMobile;
        }

        public final List<Id> w() {
            return this.enabledIdClasses;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.countryCode);
            List<Id> list = this.enabledIdClasses;
            dest.writeInt(list.size());
            Iterator<Id> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.GovernmentId.LocalizationOverride> list2 = this.localizationOverrides;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<NextStep.GovernmentId.LocalizationOverride> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            List<CaptureOptionNativeMobile> list3 = this.enabledCaptureOptionsNativeMobile;
            dest.writeInt(list3.size());
            Iterator<CaptureOptionNativeMobile> it3 = list3.iterator();
            while (it3.hasNext()) {
                dest.writeString(it3.next().name());
            }
            dest.writeInt(this.imageCaptureCount);
            dest.writeLong(this.manualCaptureButtonDelayMs);
            dest.writeString(this.fieldKeyDocument);
            dest.writeString(this.fieldKeyIdClass);
            dest.writeInt(this.shouldSkipReviewScreen ? 1 : 0);
            List<NextStep.GovernmentId.CaptureFileType> list4 = this.enabledCaptureFileTypes;
            dest.writeInt(list4.size());
            Iterator<NextStep.GovernmentId.CaptureFileType> it4 = list4.iterator();
            while (it4.hasNext()) {
                dest.writeString(it4.next().name());
            }
            List<NextStep.GovernmentId.VideoCaptureMethod> list5 = this.videoCaptureMethods;
            dest.writeInt(list5.size());
            Iterator<NextStep.GovernmentId.VideoCaptureMethod> it5 = list5.iterator();
            while (it5.hasNext()) {
                dest.writeString(it5.next().name());
            }
            dest.writeString(this.webRtcJwt);
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeParcelable(this.autoClassificationConfig, flags);
            dest.writeString(this.reviewCaptureButtonsAxis.name());
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.digitalIdConfig, flags);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getFieldKeyDocument() {
            return this.fieldKeyDocument;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final String getFieldKeyIdClass() {
            return this.fieldKeyIdClass;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public GovernmentIdStepRunning(String inquiryId, String sessionToken, v vVar, StepStyles.GovernmentIdStepStyle governmentIdStepStyle, NextStep.CancelDialog cancelDialog, String str, List<Id> enabledIdClasses, String fromComponent, String fromStep, boolean z11, boolean z12, NextStep.GovernmentId.Localizations localizations, List<NextStep.GovernmentId.LocalizationOverride> list, List<? extends CaptureOptionNativeMobile> enabledCaptureOptionsNativeMobile, int i11, long j11, String fieldKeyDocument, String fieldKeyIdClass, boolean z13, List<? extends NextStep.GovernmentId.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.GovernmentId.VideoCaptureMethod> videoCaptureMethods, String str2, NextStep.GovernmentId.AssetConfig assetConfig, qg0.a autoClassificationConfig, StyleElements.Axis reviewCaptureButtonsAxis, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z14, ug0.a aVar) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(enabledIdClasses, "enabledIdClasses");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(localizations, "localizations");
            p013kotlin.jvm.internal.s.k(enabledCaptureOptionsNativeMobile, "enabledCaptureOptionsNativeMobile");
            p013kotlin.jvm.internal.s.k(fieldKeyDocument, "fieldKeyDocument");
            p013kotlin.jvm.internal.s.k(fieldKeyIdClass, "fieldKeyIdClass");
            p013kotlin.jvm.internal.s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            p013kotlin.jvm.internal.s.k(videoCaptureMethods, "videoCaptureMethods");
            p013kotlin.jvm.internal.s.k(autoClassificationConfig, "autoClassificationConfig");
            p013kotlin.jvm.internal.s.k(reviewCaptureButtonsAxis, "reviewCaptureButtonsAxis");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.styles = governmentIdStepStyle;
            this.cancelDialog = cancelDialog;
            this.countryCode = str;
            this.enabledIdClasses = enabledIdClasses;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.localizations = localizations;
            this.localizationOverrides = list;
            this.enabledCaptureOptionsNativeMobile = enabledCaptureOptionsNativeMobile;
            this.imageCaptureCount = i11;
            this.manualCaptureButtonDelayMs = j11;
            this.fieldKeyDocument = fieldKeyDocument;
            this.fieldKeyIdClass = fieldKeyIdClass;
            this.shouldSkipReviewScreen = z13;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.webRtcJwt = str2;
            this.assetConfig = assetConfig;
            this.autoClassificationConfig = autoClassificationConfig;
            this.reviewCaptureButtonsAxis = reviewCaptureButtonsAxis;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z14;
            this.digitalIdConfig = aVar;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$h, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$h;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "inquiryId", "sessionToken", "Lhi0/g;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhi0/g;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lhi0/g;", "r", "()Lhi0/g;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadFeatureFlagSession extends l {
        public static final Parcelable.Creator<LoadFeatureFlagSession> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$h$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<LoadFeatureFlagSession> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new LoadFeatureFlagSession(parcel.readString(), parcel.readString(), (InquirySessionConfig) parcel.readParcelable(LoadFeatureFlagSession.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LoadFeatureFlagSession[] newArray(int i11) {
                return new LoadFeatureFlagSession[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadFeatureFlagSession(String inquiryId, String sessionToken, InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.inquirySessionConfig = inquirySessionConfig;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadFeatureFlagSession)) {
                return false;
            }
            LoadFeatureFlagSession loadFeatureFlagSession = (LoadFeatureFlagSession) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, loadFeatureFlagSession.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, loadFeatureFlagSession.sessionToken) && p013kotlin.jvm.internal.s.f(this.inquirySessionConfig, loadFeatureFlagSession.inquirySessionConfig);
        }

        public int hashCode() {
            return (((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31) + this.inquirySessionConfig.hashCode();
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: r, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public String toString() {
            return "LoadFeatureFlagSession(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$i, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$i;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "fallbackInquiryId", "fallbackSessionToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "g", "j", "h", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ResumeFallbackInquiry extends l {
        public static final Parcelable.Creator<ResumeFallbackInquiry> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fallbackInquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fallbackSessionToken;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$i$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ResumeFallbackInquiry> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ResumeFallbackInquiry(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ResumeFallbackInquiry[] newArray(int i11) {
                return new ResumeFallbackInquiry[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResumeFallbackInquiry(String fallbackInquiryId, String fallbackSessionToken) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(fallbackInquiryId, "fallbackInquiryId");
            p013kotlin.jvm.internal.s.k(fallbackSessionToken, "fallbackSessionToken");
            this.fallbackInquiryId = fallbackInquiryId;
            this.fallbackSessionToken = fallbackSessionToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ResumeFallbackInquiry)) {
                return false;
            }
            ResumeFallbackInquiry resumeFallbackInquiry = (ResumeFallbackInquiry) other;
            return p013kotlin.jvm.internal.s.f(this.fallbackInquiryId, resumeFallbackInquiry.fallbackInquiryId) && p013kotlin.jvm.internal.s.f(this.fallbackSessionToken, resumeFallbackInquiry.fallbackSessionToken);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getFallbackInquiryId() {
            return this.fallbackInquiryId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getFallbackSessionToken() {
            return this.fallbackSessionToken;
        }

        public int hashCode() {
            return (this.fallbackInquiryId.hashCode() * 31) + this.fallbackSessionToken.hashCode();
        }

        public String toString() {
            return "ResumeFallbackInquiry(fallbackInquiryId=" + this.fallbackInquiryId + ", fallbackSessionToken=" + this.fallbackSessionToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.fallbackInquiryId);
            dest.writeString(this.fallbackSessionToken);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$j, reason: from toString */
    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b5\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B×\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0018\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u001d\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020+¢\u0006\u0004\b0\u00101J\u008a\u0002\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00182\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010&\u001a\u00020%HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020+HÖ\u0001¢\u0006\u0004\b6\u00101J\u001a\u00109\u001a\u00020\u00102\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u00105R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u00105R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\bP\u00105R\u001a\u0010\u000f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010<\u001a\u0004\bR\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b=\u0010S\u001a\u0004\b@\u0010TR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bU\u0010S\u001a\u0004\bD\u0010TR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bV\u0010<\u001a\u0004\bV\u00105R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bW\u0010S\u001a\u0004\bX\u0010TR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bP\u0010S\u001a\u0004\bY\u0010TR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\bZ\u0010\\R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\bH\u0010_R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0006¢\u0006\f\n\u0004\b`\u0010^\u001a\u0004\ba\u0010_R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\b;\u0010dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bX\u0010<\u001a\u0004\be\u00105R\u001f\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bN\u0010^\u001a\u0004\b]\u0010_R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\b`\u0010hR\u0017\u0010$\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bi\u0010S\u001a\u0004\b>\u0010TR\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\bY\u0010j\u001a\u0004\bb\u0010k¨\u0006l"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$j;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lbh0/r2;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "selfieType", "fromComponent", "fromStep", "", "backStepEnabled", "cancelButtonEnabled", "fieldKeySelfie", "requireStrictSelfieCapture", "skipPromptPage", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "localizations", "", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureFileType;", "enabledCaptureFileTypes", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$VideoCaptureMethod;", "videoCaptureMethods", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "assetConfig", "webRtcJwt", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$SelfiePose;", "orderedPoses", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "pendingPageTextVerticalPosition", "audioEnabled", "Lth0/s0;", "poseConfigs", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLth0/s0;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZZLcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLth0/s0;)Lcom/withpersona/sdk2/inquiry/internal/l$j;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "E", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "A", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "u", "p", "c", "Z", "()Z", "r", "s", "t", "z", "D", "v", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$Localizations;", "w", "Ljava/util/List;", "()Ljava/util/List;", "x", Gender.FEMALE, "y", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;", "G", "B", "Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;", "C", "Lth0/s0;", "()Lth0/s0;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SelfieStepRunning extends l implements r2 {
        public static final Parcelable.Creator<SelfieStepRunning> CREATOR = new a();

        /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
        private final List<NextStep.Selfie.SelfiePose> orderedPoses;

        /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
        private final PendingPageTextPosition pendingPageTextVerticalPosition;

        /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
        private final boolean audioEnabled;

        /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
        private final PoseConfigs poseConfigs;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.SelfieStepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Selfie.CaptureMethod selfieType;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromComponent;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fromStep;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fieldKeySelfie;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean requireStrictSelfieCapture;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean skipPromptPage;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Selfie.Localizations localizations;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Selfie.AssetConfig assetConfig;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final String webRtcJwt;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$j$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<SelfieStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning createFromParcel(Parcel parcel) {
                boolean z11;
                boolean z12;
                ArrayList arrayList;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                v vVar = (v) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                StepStyles.SelfieStepStyle selfieStepStyle = (StepStyles.SelfieStepStyle) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                NextStep.Selfie.CaptureMethod captureMethodValueOf = NextStep.Selfie.CaptureMethod.valueOf(parcel.readString());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z13 = false;
                boolean z14 = true;
                if (parcel.readInt() != 0) {
                    z13 = true;
                }
                if (parcel.readInt() == 0) {
                    z14 = z13;
                }
                String string5 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z11 = true;
                    z12 = true;
                } else {
                    z11 = z14;
                    z12 = z13;
                }
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                NextStep.Selfie.Localizations localizations = (NextStep.Selfie.Localizations) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                int i11 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i11);
                int i12 = 0;
                while (i12 != i11) {
                    arrayList2.add(NextStep.Selfie.CaptureFileType.valueOf(parcel.readString()));
                    i12++;
                    i11 = i11;
                }
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int i14 = 0;
                while (i14 != i13) {
                    arrayList3.add(NextStep.Selfie.VideoCaptureMethod.valueOf(parcel.readString()));
                    i14++;
                    i13 = i13;
                }
                NextStep.Selfie.AssetConfig assetConfig = (NextStep.Selfie.AssetConfig) parcel.readParcelable(SelfieStepRunning.class.getClassLoader());
                String string6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList = new ArrayList(i15);
                    int i16 = 0;
                    while (i16 != i15) {
                        arrayList.add(NextStep.Selfie.SelfiePose.valueOf(parcel.readString()));
                        i16++;
                        i15 = i15;
                    }
                }
                PendingPageTextPosition pendingPageTextPositionValueOf = PendingPageTextPosition.valueOf(parcel.readString());
                if (parcel.readInt() == 0) {
                    z11 = false;
                }
                return new SelfieStepRunning(string, string2, vVar, selfieStepStyle, cancelDialog, captureMethodValueOf, string3, string4, z13, z14, string5, z12, z11, localizations, arrayList2, arrayList3, assetConfig, string6, arrayList, pendingPageTextPositionValueOf, z11, (PoseConfigs) parcel.readParcelable(SelfieStepRunning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final SelfieStepRunning[] newArray(int i11) {
                return new SelfieStepRunning[i11];
            }
        }

        public /* synthetic */ SelfieStepRunning(String str, String str2, v vVar, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z11, boolean z12, String str5, boolean z13, boolean z14, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z15, PoseConfigs poseConfigs, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : vVar, selfieStepStyle, cancelDialog, captureMethod, str3, str4, z11, z12, str5, z13, z14, localizations, list, list2, assetConfig, str6, list3, pendingPageTextPosition, z15, poseConfigs);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SelfieStepRunning h(SelfieStepRunning selfieStepRunning, String str, String str2, v vVar, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod captureMethod, String str3, String str4, boolean z11, boolean z12, String str5, boolean z13, boolean z14, NextStep.Selfie.Localizations localizations, List list, List list2, NextStep.Selfie.AssetConfig assetConfig, String str6, List list3, PendingPageTextPosition pendingPageTextPosition, boolean z15, PoseConfigs poseConfigs, int i11, Object obj) {
            PoseConfigs poseConfigs2;
            boolean z16;
            String str7 = (i11 & 1) != 0 ? selfieStepRunning.inquiryId : str;
            String str8 = (i11 & 2) != 0 ? selfieStepRunning.sessionToken : str2;
            v vVar2 = (i11 & 4) != 0 ? selfieStepRunning.transitionStatus : vVar;
            StepStyles.SelfieStepStyle selfieStepStyle2 = (i11 & 8) != 0 ? selfieStepRunning.styles : selfieStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i11 & 16) != 0 ? selfieStepRunning.cancelDialog : cancelDialog;
            NextStep.Selfie.CaptureMethod captureMethod2 = (i11 & 32) != 0 ? selfieStepRunning.selfieType : captureMethod;
            String str9 = (i11 & 64) != 0 ? selfieStepRunning.fromComponent : str3;
            String str10 = (i11 & 128) != 0 ? selfieStepRunning.fromStep : str4;
            boolean z17 = (i11 & 256) != 0 ? selfieStepRunning.backStepEnabled : z11;
            boolean z18 = (i11 & 512) != 0 ? selfieStepRunning.cancelButtonEnabled : z12;
            String str11 = (i11 & 1024) != 0 ? selfieStepRunning.fieldKeySelfie : str5;
            boolean z19 = (i11 & 2048) != 0 ? selfieStepRunning.requireStrictSelfieCapture : z13;
            boolean z21 = (i11 & 4096) != 0 ? selfieStepRunning.skipPromptPage : z14;
            NextStep.Selfie.Localizations localizations2 = (i11 & PKIFailureInfo.certRevoked) != 0 ? selfieStepRunning.localizations : localizations;
            String str12 = str7;
            List list4 = (i11 & 16384) != 0 ? selfieStepRunning.enabledCaptureFileTypes : list;
            List list5 = (i11 & 32768) != 0 ? selfieStepRunning.videoCaptureMethods : list2;
            NextStep.Selfie.AssetConfig assetConfig2 = (i11 & 65536) != 0 ? selfieStepRunning.assetConfig : assetConfig;
            String str13 = (i11 & 131072) != 0 ? selfieStepRunning.webRtcJwt : str6;
            List list6 = (i11 & 262144) != 0 ? selfieStepRunning.orderedPoses : list3;
            PendingPageTextPosition pendingPageTextPosition2 = (i11 & PKIFailureInfo.signerNotTrusted) != 0 ? selfieStepRunning.pendingPageTextVerticalPosition : pendingPageTextPosition;
            boolean z22 = (i11 & PKIFailureInfo.badCertTemplate) != 0 ? selfieStepRunning.audioEnabled : z15;
            if ((i11 & PKIFailureInfo.badSenderNonce) != 0) {
                z16 = z22;
                poseConfigs2 = selfieStepRunning.poseConfigs;
            } else {
                poseConfigs2 = poseConfigs;
                z16 = z22;
            }
            return selfieStepRunning.g(str12, str8, vVar2, selfieStepStyle2, cancelDialog2, captureMethod2, str9, str10, z17, z18, str11, z19, z21, localizations2, list4, list5, assetConfig2, str13, list6, pendingPageTextPosition2, z16, poseConfigs2);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final NextStep.Selfie.CaptureMethod getSelfieType() {
            return this.selfieType;
        }

        /* JADX INFO: renamed from: D, reason: from getter */
        public final boolean getSkipPromptPage() {
            return this.skipPromptPage;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: E, reason: from getter */
        public StepStyles.SelfieStepStyle getStyles() {
            return this.styles;
        }

        public final List<NextStep.Selfie.VideoCaptureMethod> F() {
            return this.videoCaptureMethods;
        }

        /* JADX INFO: renamed from: G, reason: from getter */
        public final String getWebRtcJwt() {
            return this.webRtcJwt;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFromStep() {
            return this.fromStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelfieStepRunning)) {
                return false;
            }
            SelfieStepRunning selfieStepRunning = (SelfieStepRunning) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, selfieStepRunning.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, selfieStepRunning.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, selfieStepRunning.transitionStatus) && p013kotlin.jvm.internal.s.f(this.styles, selfieStepRunning.styles) && p013kotlin.jvm.internal.s.f(this.cancelDialog, selfieStepRunning.cancelDialog) && this.selfieType == selfieStepRunning.selfieType && p013kotlin.jvm.internal.s.f(this.fromComponent, selfieStepRunning.fromComponent) && p013kotlin.jvm.internal.s.f(this.fromStep, selfieStepRunning.fromStep) && this.backStepEnabled == selfieStepRunning.backStepEnabled && this.cancelButtonEnabled == selfieStepRunning.cancelButtonEnabled && p013kotlin.jvm.internal.s.f(this.fieldKeySelfie, selfieStepRunning.fieldKeySelfie) && this.requireStrictSelfieCapture == selfieStepRunning.requireStrictSelfieCapture && this.skipPromptPage == selfieStepRunning.skipPromptPage && p013kotlin.jvm.internal.s.f(this.localizations, selfieStepRunning.localizations) && p013kotlin.jvm.internal.s.f(this.enabledCaptureFileTypes, selfieStepRunning.enabledCaptureFileTypes) && p013kotlin.jvm.internal.s.f(this.videoCaptureMethods, selfieStepRunning.videoCaptureMethods) && p013kotlin.jvm.internal.s.f(this.assetConfig, selfieStepRunning.assetConfig) && p013kotlin.jvm.internal.s.f(this.webRtcJwt, selfieStepRunning.webRtcJwt) && p013kotlin.jvm.internal.s.f(this.orderedPoses, selfieStepRunning.orderedPoses) && this.pendingPageTextVerticalPosition == selfieStepRunning.pendingPageTextVerticalPosition && this.audioEnabled == selfieStepRunning.audioEnabled && p013kotlin.jvm.internal.s.f(this.poseConfigs, selfieStepRunning.poseConfigs);
        }

        public final SelfieStepRunning g(String inquiryId, String sessionToken, v transitionStatus, StepStyles.SelfieStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod selfieType, String fromComponent, String fromStep, boolean backStepEnabled, boolean cancelButtonEnabled, String fieldKeySelfie, boolean requireStrictSelfieCapture, boolean skipPromptPage, NextStep.Selfie.Localizations localizations, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, NextStep.Selfie.AssetConfig assetConfig, String webRtcJwt, List<? extends NextStep.Selfie.SelfiePose> orderedPoses, PendingPageTextPosition pendingPageTextVerticalPosition, boolean audioEnabled, PoseConfigs poseConfigs) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(selfieType, "selfieType");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(fieldKeySelfie, "fieldKeySelfie");
            p013kotlin.jvm.internal.s.k(localizations, "localizations");
            p013kotlin.jvm.internal.s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            p013kotlin.jvm.internal.s.k(videoCaptureMethods, "videoCaptureMethods");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            return new SelfieStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, selfieType, fromComponent, fromStep, backStepEnabled, cancelButtonEnabled, fieldKeySelfie, requireStrictSelfieCapture, skipPromptPage, localizations, enabledCaptureFileTypes, videoCaptureMethods, assetConfig, webRtcJwt, orderedPoses, pendingPageTextVerticalPosition, audioEnabled, poseConfigs);
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
            StepStyles.SelfieStepStyle selfieStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (selfieStepStyle == null ? 0 : selfieStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((((((((((((((((((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.selfieType.hashCode()) * 31) + this.fromComponent.hashCode()) * 31) + this.fromStep.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.fieldKeySelfie.hashCode()) * 31) + Boolean.hashCode(this.requireStrictSelfieCapture)) * 31) + Boolean.hashCode(this.skipPromptPage)) * 31) + this.localizations.hashCode()) * 31) + this.enabledCaptureFileTypes.hashCode()) * 31) + this.videoCaptureMethods.hashCode()) * 31;
            NextStep.Selfie.AssetConfig assetConfig = this.assetConfig;
            int iHashCode5 = (iHashCode4 + (assetConfig == null ? 0 : assetConfig.hashCode())) * 31;
            String str = this.webRtcJwt;
            int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            List<NextStep.Selfie.SelfiePose> list = this.orderedPoses;
            return ((((((iHashCode6 + (list != null ? list.hashCode() : 0)) * 31) + this.pendingPageTextVerticalPosition.hashCode()) * 31) + Boolean.hashCode(this.audioEnabled)) * 31) + this.poseConfigs.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final NextStep.Selfie.AssetConfig getAssetConfig() {
            return this.assetConfig;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getAudioEnabled() {
            return this.audioEnabled;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        public final List<NextStep.Selfie.CaptureFileType> m() {
            return this.enabledCaptureFileTypes;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getFieldKeySelfie() {
            return this.fieldKeySelfie;
        }

        public String toString() {
            return "SelfieStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", selfieType=" + this.selfieType + ", fromComponent=" + this.fromComponent + ", fromStep=" + this.fromStep + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", fieldKeySelfie=" + this.fieldKeySelfie + ", requireStrictSelfieCapture=" + this.requireStrictSelfieCapture + ", skipPromptPage=" + this.skipPromptPage + ", localizations=" + this.localizations + ", enabledCaptureFileTypes=" + this.enabledCaptureFileTypes + ", videoCaptureMethods=" + this.videoCaptureMethods + ", assetConfig=" + this.assetConfig + ", webRtcJwt=" + this.webRtcJwt + ", orderedPoses=" + this.orderedPoses + ", pendingPageTextVerticalPosition=" + this.pendingPageTextVerticalPosition + ", audioEnabled=" + this.audioEnabled + ", poseConfigs=" + this.poseConfigs + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final String getFromComponent() {
            return this.fromComponent;
        }

        /* JADX INFO: renamed from: v, reason: from getter */
        public final NextStep.Selfie.Localizations getLocalizations() {
            return this.localizations;
        }

        public final List<NextStep.Selfie.SelfiePose> w() {
            return this.orderedPoses;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.selfieType.name());
            dest.writeString(this.fromComponent);
            dest.writeString(this.fromStep);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.fieldKeySelfie);
            dest.writeInt(this.requireStrictSelfieCapture ? 1 : 0);
            dest.writeInt(this.skipPromptPage ? 1 : 0);
            dest.writeParcelable(this.localizations, flags);
            List<NextStep.Selfie.CaptureFileType> list = this.enabledCaptureFileTypes;
            dest.writeInt(list.size());
            Iterator<NextStep.Selfie.CaptureFileType> it = list.iterator();
            while (it.hasNext()) {
                dest.writeString(it.next().name());
            }
            List<NextStep.Selfie.VideoCaptureMethod> list2 = this.videoCaptureMethods;
            dest.writeInt(list2.size());
            Iterator<NextStep.Selfie.VideoCaptureMethod> it2 = list2.iterator();
            while (it2.hasNext()) {
                dest.writeString(it2.next().name());
            }
            dest.writeParcelable(this.assetConfig, flags);
            dest.writeString(this.webRtcJwt);
            List<NextStep.Selfie.SelfiePose> list3 = this.orderedPoses;
            if (list3 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list3.size());
                Iterator<NextStep.Selfie.SelfiePose> it3 = list3.iterator();
                while (it3.hasNext()) {
                    dest.writeString(it3.next().name());
                }
            }
            dest.writeString(this.pendingPageTextVerticalPosition.name());
            dest.writeInt(this.audioEnabled ? 1 : 0);
            dest.writeParcelable(this.poseConfigs, flags);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final PendingPageTextPosition getPendingPageTextVerticalPosition() {
            return this.pendingPageTextVerticalPosition;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final PoseConfigs getPoseConfigs() {
            return this.poseConfigs;
        }

        /* JADX INFO: renamed from: z, reason: from getter */
        public final boolean getRequireStrictSelfieCapture() {
            return this.requireStrictSelfieCapture;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SelfieStepRunning(String inquiryId, String sessionToken, v vVar, StepStyles.SelfieStepStyle selfieStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Selfie.CaptureMethod selfieType, String fromComponent, String fromStep, boolean z11, boolean z12, String fieldKeySelfie, boolean z13, boolean z14, NextStep.Selfie.Localizations localizations, List<? extends NextStep.Selfie.CaptureFileType> enabledCaptureFileTypes, List<? extends NextStep.Selfie.VideoCaptureMethod> videoCaptureMethods, NextStep.Selfie.AssetConfig assetConfig, String str, List<? extends NextStep.Selfie.SelfiePose> list, PendingPageTextPosition pendingPageTextVerticalPosition, boolean z15, PoseConfigs poseConfigs) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(selfieType, "selfieType");
            p013kotlin.jvm.internal.s.k(fromComponent, "fromComponent");
            p013kotlin.jvm.internal.s.k(fromStep, "fromStep");
            p013kotlin.jvm.internal.s.k(fieldKeySelfie, "fieldKeySelfie");
            p013kotlin.jvm.internal.s.k(localizations, "localizations");
            p013kotlin.jvm.internal.s.k(enabledCaptureFileTypes, "enabledCaptureFileTypes");
            p013kotlin.jvm.internal.s.k(videoCaptureMethods, "videoCaptureMethods");
            p013kotlin.jvm.internal.s.k(pendingPageTextVerticalPosition, "pendingPageTextVerticalPosition");
            p013kotlin.jvm.internal.s.k(poseConfigs, "poseConfigs");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.styles = selfieStepStyle;
            this.cancelDialog = cancelDialog;
            this.selfieType = selfieType;
            this.fromComponent = fromComponent;
            this.fromStep = fromStep;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.fieldKeySelfie = fieldKeySelfie;
            this.requireStrictSelfieCapture = z13;
            this.skipPromptPage = z14;
            this.localizations = localizations;
            this.enabledCaptureFileTypes = enabledCaptureFileTypes;
            this.videoCaptureMethods = videoCaptureMethods;
            this.assetConfig = assetConfig;
            this.webRtcJwt = str;
            this.orderedPoses = list;
            this.pendingPageTextVerticalPosition = pendingPageTextVerticalPosition;
            this.audioEnabled = z15;
            this.poseConfigs = poseConfigs;
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$l, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BÃ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u001d\u0010)\u001a\u00020(2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020&¢\u0006\u0004\b+\u0010,Jê\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00032\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020&HÖ\u0001¢\u0006\u0004\b1\u0010,J\u001a\u00104\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00100R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b:\u00100R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\bK\u00100R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bL\u00107\u001a\u0004\bM\u00100R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b8\u0010N\u001a\u0004\bO\u0010PR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\b6\u0010SR\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bK\u0010R\u001a\u0004\b9\u0010SR\u0017\u0010\u0016\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bT\u0010R\u001a\u0004\bC\u0010SR#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\bI\u0010U\u001a\u0004\b?\u0010VR\u0017\u0010\u001a\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u00107\u001a\u0004\b;\u00100R\u001f\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bW\u0010PR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bX\u0010ZR\u001a\u0010 \u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bQ\u0010]R\u0017\u0010!\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b^\u0010R\u001a\u0004\b[\u0010SR\u0014\u0010`\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u00100¨\u0006a"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$l;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lbh0/r2;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "localizations", "inquiryStatus", "stepName", "", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/UiComponentConfig;", "components", "", "backStepEnabled", "cancelButtonEnabled", "finalStep", "", "Lcom/withpersona/sdk2/inquiry/network/dto/InquiryField;", "fields", "clientSideKey", "Lcom/withpersona/sdk2/inquiry/network/core/dto/UiComponentError;", "serverComponentErrors", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lhi0/g;", "inquirySessionConfig", "isRestoringState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lhi0/g;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZLjava/util/Map;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lhi0/g;Z)Lcom/withpersona/sdk2/inquiry/internal/l$l;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "n", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "u", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Ui$Localizations;", "s", "p", "w", "Ljava/util/List;", "getComponents", "()Ljava/util/List;", "r", "Z", "()Z", "t", "Ljava/util/Map;", "()Ljava/util/Map;", "v", "x", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "y", "Lhi0/g;", "()Lhi0/g;", "z", "c", "fromStep", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UiStepRunning extends l implements r2 {
        public static final Parcelable.Creator<UiStepRunning> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.UiStepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Ui.Localizations localizations;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryStatus;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<UiComponentConfig> components;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean finalStep;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, InquiryField> fields;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSideKey;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<UiComponentError> serverComponentErrors;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
        private final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRestoringState;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$l$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<UiStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                v vVar = (v) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                StepStyles.UiStepStyle uiStepStyle = (StepStyles.UiStepStyle) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.CancelDialog cancelDialog = (NextStep.CancelDialog) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                NextStep.Ui.Localizations localizations = (NextStep.Ui.Localizations) parcel.readParcelable(UiStepRunning.class.getClassLoader());
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z11 = false;
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i11 = parcel.readInt();
                    arrayList = new ArrayList(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        arrayList.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    }
                }
                boolean z12 = true;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                boolean z13 = parcel.readInt() != 0 ? true : z11;
                if (parcel.readInt() == 0) {
                    z12 = false;
                }
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
                int i14 = 0;
                while (i14 != i13) {
                    linkedHashMap.put(parcel.readString(), parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                    i14++;
                    i13 = i13;
                }
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i15 = parcel.readInt();
                    arrayList2 = new ArrayList(i15);
                    int i16 = 0;
                    while (i16 != i15) {
                        arrayList2.add(parcel.readParcelable(UiStepRunning.class.getClassLoader()));
                        i16++;
                        i15 = i15;
                    }
                }
                return new UiStepRunning(string, string2, vVar, uiStepStyle, cancelDialog, localizations, string3, string4, arrayList, z11, z13, z12, linkedHashMap, string5, arrayList2, (InternalErrorInfo) parcel.readParcelable(UiStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(UiStepRunning.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final UiStepRunning[] newArray(int i11) {
                return new UiStepRunning[i11];
            }
        }

        public /* synthetic */ UiStepRunning(String str, String str2, v vVar, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str3, String str4, List list, boolean z11, boolean z12, boolean z13, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : vVar, uiStepStyle, cancelDialog, localizations, str3, str4, list, z11, z12, z13, map, str5, list2, (i11 & 32768) != 0 ? null : internalErrorInfo, (i11 & 65536) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, z14);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UiStepRunning h(UiStepRunning uiStepRunning, String str, String str2, v vVar, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String str3, String str4, List list, boolean z11, boolean z12, boolean z13, Map map, String str5, List list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z14, int i11, Object obj) {
            boolean z15;
            InquirySessionConfig inquirySessionConfig2;
            String str6 = (i11 & 1) != 0 ? uiStepRunning.inquiryId : str;
            String str7 = (i11 & 2) != 0 ? uiStepRunning.sessionToken : str2;
            v vVar2 = (i11 & 4) != 0 ? uiStepRunning.transitionStatus : vVar;
            StepStyles.UiStepStyle uiStepStyle2 = (i11 & 8) != 0 ? uiStepRunning.styles : uiStepStyle;
            NextStep.CancelDialog cancelDialog2 = (i11 & 16) != 0 ? uiStepRunning.cancelDialog : cancelDialog;
            NextStep.Ui.Localizations localizations2 = (i11 & 32) != 0 ? uiStepRunning.localizations : localizations;
            String str8 = (i11 & 64) != 0 ? uiStepRunning.inquiryStatus : str3;
            String str9 = (i11 & 128) != 0 ? uiStepRunning.stepName : str4;
            List list3 = (i11 & 256) != 0 ? uiStepRunning.components : list;
            boolean z16 = (i11 & 512) != 0 ? uiStepRunning.backStepEnabled : z11;
            boolean z17 = (i11 & 1024) != 0 ? uiStepRunning.cancelButtonEnabled : z12;
            boolean z18 = (i11 & 2048) != 0 ? uiStepRunning.finalStep : z13;
            Map map2 = (i11 & 4096) != 0 ? uiStepRunning.fields : map;
            String str10 = (i11 & PKIFailureInfo.certRevoked) != 0 ? uiStepRunning.clientSideKey : str5;
            String str11 = str6;
            List list4 = (i11 & 16384) != 0 ? uiStepRunning.serverComponentErrors : list2;
            InternalErrorInfo internalErrorInfo2 = (i11 & 32768) != 0 ? uiStepRunning.transitionError : internalErrorInfo;
            InquirySessionConfig inquirySessionConfig3 = (i11 & 65536) != 0 ? uiStepRunning.inquirySessionConfig : inquirySessionConfig;
            if ((i11 & 131072) != 0) {
                inquirySessionConfig2 = inquirySessionConfig3;
                z15 = uiStepRunning.isRestoringState;
            } else {
                z15 = z14;
                inquirySessionConfig2 = inquirySessionConfig3;
            }
            return uiStepRunning.g(str11, str7, vVar2, uiStepStyle2, cancelDialog2, localizations2, str8, str9, list3, z16, z17, z18, map2, str10, list4, internalErrorInfo2, inquirySessionConfig2, z15);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UiStepRunning)) {
                return false;
            }
            UiStepRunning uiStepRunning = (UiStepRunning) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, uiStepRunning.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, uiStepRunning.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, uiStepRunning.transitionStatus) && p013kotlin.jvm.internal.s.f(this.styles, uiStepRunning.styles) && p013kotlin.jvm.internal.s.f(this.cancelDialog, uiStepRunning.cancelDialog) && p013kotlin.jvm.internal.s.f(this.localizations, uiStepRunning.localizations) && p013kotlin.jvm.internal.s.f(this.inquiryStatus, uiStepRunning.inquiryStatus) && p013kotlin.jvm.internal.s.f(this.stepName, uiStepRunning.stepName) && p013kotlin.jvm.internal.s.f(this.components, uiStepRunning.components) && this.backStepEnabled == uiStepRunning.backStepEnabled && this.cancelButtonEnabled == uiStepRunning.cancelButtonEnabled && this.finalStep == uiStepRunning.finalStep && p013kotlin.jvm.internal.s.f(this.fields, uiStepRunning.fields) && p013kotlin.jvm.internal.s.f(this.clientSideKey, uiStepRunning.clientSideKey) && p013kotlin.jvm.internal.s.f(this.serverComponentErrors, uiStepRunning.serverComponentErrors) && p013kotlin.jvm.internal.s.f(this.transitionError, uiStepRunning.transitionError) && p013kotlin.jvm.internal.s.f(this.inquirySessionConfig, uiStepRunning.inquirySessionConfig) && this.isRestoringState == uiStepRunning.isRestoringState;
        }

        public final UiStepRunning g(String inquiryId, String sessionToken, v transitionStatus, StepStyles.UiStepStyle styles, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String inquiryStatus, String stepName, List<? extends UiComponentConfig> components, boolean backStepEnabled, boolean cancelButtonEnabled, boolean finalStep, Map<String, ? extends InquiryField> fields, String clientSideKey, List<? extends UiComponentError> serverComponentErrors, InternalErrorInfo transitionError, InquirySessionConfig inquirySessionConfig, boolean isRestoringState) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(fields, "fields");
            p013kotlin.jvm.internal.s.k(clientSideKey, "clientSideKey");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            return new UiStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, localizations, inquiryStatus, stepName, components, backStepEnabled, cancelButtonEnabled, finalStep, fields, clientSideKey, serverComponentErrors, transitionError, inquirySessionConfig, isRestoringState);
        }

        public final List<UiComponentConfig> getComponents() {
            return this.components;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
            StepStyles.UiStepStyle uiStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (uiStepStyle == null ? 0 : uiStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31;
            NextStep.Ui.Localizations localizations = this.localizations;
            int iHashCode5 = (((((iHashCode4 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31;
            List<UiComponentConfig> list = this.components;
            int iHashCode6 = (((((((((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + Boolean.hashCode(this.finalStep)) * 31) + this.fields.hashCode()) * 31) + this.clientSideKey.hashCode()) * 31;
            List<UiComponentError> list2 = this.serverComponentErrors;
            int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return ((((iHashCode7 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31) + this.inquirySessionConfig.hashCode()) * 31) + Boolean.hashCode(this.isRestoringState);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getClientSideKey() {
            return this.clientSideKey;
        }

        public final Map<String, InquiryField> l() {
            return this.fields;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final boolean getFinalStep() {
            return this.finalStep;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: r, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        /* JADX INFO: renamed from: s, reason: from getter */
        public final String getInquiryStatus() {
            return this.inquiryStatus;
        }

        public String toString() {
            return "UiStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", components=" + this.components + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", finalStep=" + this.finalStep + ", fields=" + this.fields + ", clientSideKey=" + this.clientSideKey + ", serverComponentErrors=" + this.serverComponentErrors + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ", isRestoringState=" + this.isRestoringState + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final NextStep.Ui.Localizations getLocalizations() {
            return this.localizations;
        }

        public final List<UiComponentError> v() {
            return this.serverComponentErrors;
        }

        public final String w() {
            return this.stepName;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            List<UiComponentConfig> list = this.components;
            if (list == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator<UiComponentConfig> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeInt(this.finalStep ? 1 : 0);
            Map<String, InquiryField> map = this.fields;
            dest.writeInt(map.size());
            for (Map.Entry<String, InquiryField> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeParcelable(entry.getValue(), flags);
            }
            dest.writeString(this.clientSideKey);
            List<UiComponentError> list2 = this.serverComponentErrors;
            if (list2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(list2.size());
                Iterator<UiComponentError> it2 = list2.iterator();
                while (it2.hasNext()) {
                    dest.writeParcelable(it2.next(), flags);
                }
            }
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
            dest.writeInt(this.isRestoringState ? 1 : 0);
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getIsRestoringState() {
            return this.isRestoringState;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        public StepStyles.UiStepStyle getStyles() {
            return this.styles;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public UiStepRunning(String inquiryId, String sessionToken, v vVar, StepStyles.UiStepStyle uiStepStyle, NextStep.CancelDialog cancelDialog, NextStep.Ui.Localizations localizations, String inquiryStatus, String stepName, List<? extends UiComponentConfig> list, boolean z11, boolean z12, boolean z13, Map<String, ? extends InquiryField> fields, String clientSideKey, List<? extends UiComponentError> list2, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, boolean z14) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(fields, "fields");
            p013kotlin.jvm.internal.s.k(clientSideKey, "clientSideKey");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.styles = uiStepStyle;
            this.cancelDialog = cancelDialog;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.components = list;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.finalStep = z13;
            this.fields = fields;
            this.clientSideKey = clientSideKey;
            this.serverComponentErrors = list2;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
            this.isRestoringState = z14;
        }
    }

    public /* synthetic */ l(String str, String str2, v vVar, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, vVar, stepStyle, cancelDialog, str3, inquirySessionConfig);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public NextStep.CancelDialog getCancelDialog() {
        return this.cancelDialog;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getDidGoBack() {
        return this.didGoBack;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public String getFromStep() {
        return this.fromStep;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public v getTransitionStatus() {
        return this.transitionStatus;
    }

    public final void e(boolean z11) {
        this.didGoBack = z11;
    }

    public final l f(v transitionStatus) {
        if (this instanceof Complete) {
            return Complete.h((Complete) this, null, null, transitionStatus, null, null, 27, null);
        }
        if ((this instanceof CreateInquiryFromTemplate) || (this instanceof ResumeFallbackInquiry) || (this instanceof CreateInquirySession) || (this instanceof ExchangeOneTimeCode)) {
            return this;
        }
        if (this instanceof DocumentStepRunning) {
            return DocumentStepRunning.h((DocumentStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, null, 1019, null);
        }
        if (this instanceof GovernmentIdStepRunning) {
            return GovernmentIdStepRunning.h((GovernmentIdStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, null, null, null, 0, 0L, null, null, false, null, null, null, null, null, null, null, false, null, 268435451, null);
        }
        if (this instanceof SelfieStepRunning) {
            return SelfieStepRunning.h((SelfieStepRunning) this, null, null, transitionStatus, null, null, null, null, null, false, false, null, false, false, null, null, null, null, null, null, null, false, null, 4194299, null);
        }
        if (this instanceof ShowLoadingSpinner) {
            return ShowLoadingSpinner.h((ShowLoadingSpinner) this, null, transitionStatus, null, null, false, null, 61, null);
        }
        if (this instanceof UiStepRunning) {
            return UiStepRunning.h((UiStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, 262139, null);
        }
        if (this instanceof IntegrationStepRunning) {
            return IntegrationStepRunning.h((IntegrationStepRunning) this, null, null, transitionStatus, null, null, null, null, null, null, null, false, false, null, null, null, null, 65531, null);
        }
        if (this instanceof LoadFeatureFlagSession) {
            return this;
        }
        throw new NoWhenBranchMatchedException();
    }

    public StepStyle getStyles() {
        return this.styles;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public String getSessionToken() {
        return this.sessionToken;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public String getInquiryId() {
        return this.inquiryId;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public InquirySessionConfig getInquirySessionConfig() {
        return this.inquirySessionConfig;
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$g, reason: from toString */
    @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b-\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0099\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&J¼\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010*R\u001a\u0010\u0005\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bA\u00101\u001a\u0004\bB\u0010*R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\bG\u0010*R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bH\u00101\u001a\u0004\b=\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\b0\u0010JR\u0017\u0010\u0014\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bK\u0010I\u001a\u0004\b3\u0010JR\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bM\u0010*R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b9\u0010PR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bL\u0010SR\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bH\u0010VR\u0014\u0010X\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010*¨\u0006Y"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$g;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "Lbh0/r2;", "", "inquiryId", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "cancelDialog", "type", "flowUrl", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "localizations", "inquiryStatus", "stepName", "", "backStepEnabled", "cancelButtonEnabled", "clientSideKey", "Lah0/e;", "integrationPage", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "transitionError", "Lhi0/g;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lah0/e;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lhi0/g;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lah0/e;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lhi0/g;)Lcom/withpersona/sdk2/inquiry/internal/l$g;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "q", "j", "o", "k", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "s", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$IntegrationStepStyle;", "m", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "a", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$CancelDialog;", "n", "getType", "p", "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "getLocalizations", "()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$Localizations;", "getInquiryStatus", "r", "Z", "()Z", "t", "u", "getClientSideKey", "v", "Lah0/e;", "()Lah0/e;", "w", "Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;", "x", "Lhi0/g;", "()Lhi0/g;", "c", "fromStep", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IntegrationStepRunning extends l implements r2 {
        public static final Parcelable.Creator<IntegrationStepRunning> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyles.IntegrationStepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.CancelDialog cancelDialog;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String type;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final String flowUrl;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
        private final NextStep.Integration.Localizations localizations;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryStatus;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepName;

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean backStepEnabled;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean cancelButtonEnabled;

        /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSideKey;

        /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
        private final ah0.e integrationPage;

        /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
        private final InternalErrorInfo transitionError;

        /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
        private final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$g$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IntegrationStepRunning> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new IntegrationStepRunning(parcel.readString(), parcel.readString(), (v) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (StepStyles.IntegrationStepStyle) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (NextStep.CancelDialog) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), (NextStep.Integration.Localizations) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (ah0.e) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InternalErrorInfo) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()), (InquirySessionConfig) parcel.readParcelable(IntegrationStepRunning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final IntegrationStepRunning[] newArray(int i11) {
                return new IntegrationStepRunning[i11];
            }
        }

        public /* synthetic */ IntegrationStepRunning(String str, String str2, v vVar, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str3, String str4, NextStep.Integration.Localizations localizations, String str5, String str6, boolean z11, boolean z12, String str7, ah0.e eVar, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? null : vVar, integrationStepStyle, cancelDialog, str3, str4, localizations, str5, str6, z11, z12, str7, eVar, (i11 & 16384) != 0 ? null : internalErrorInfo, (i11 & 32768) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        public static /* synthetic */ IntegrationStepRunning h(IntegrationStepRunning integrationStepRunning, String str, String str2, v vVar, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String str3, String str4, NextStep.Integration.Localizations localizations, String str5, String str6, boolean z11, boolean z12, String str7, ah0.e eVar, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig, int i11, Object obj) {
            return integrationStepRunning.g((i11 & 1) != 0 ? integrationStepRunning.inquiryId : str, (i11 & 2) != 0 ? integrationStepRunning.sessionToken : str2, (i11 & 4) != 0 ? integrationStepRunning.transitionStatus : vVar, (i11 & 8) != 0 ? integrationStepRunning.styles : integrationStepStyle, (i11 & 16) != 0 ? integrationStepRunning.cancelDialog : cancelDialog, (i11 & 32) != 0 ? integrationStepRunning.type : str3, (i11 & 64) != 0 ? integrationStepRunning.flowUrl : str4, (i11 & 128) != 0 ? integrationStepRunning.localizations : localizations, (i11 & 256) != 0 ? integrationStepRunning.inquiryStatus : str5, (i11 & 512) != 0 ? integrationStepRunning.stepName : str6, (i11 & 1024) != 0 ? integrationStepRunning.backStepEnabled : z11, (i11 & 2048) != 0 ? integrationStepRunning.cancelButtonEnabled : z12, (i11 & 4096) != 0 ? integrationStepRunning.clientSideKey : str7, (i11 & PKIFailureInfo.certRevoked) != 0 ? integrationStepRunning.integrationPage : eVar, (i11 & 16384) != 0 ? integrationStepRunning.transitionError : internalErrorInfo, (i11 & 32768) != 0 ? integrationStepRunning.inquirySessionConfig : inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: a, reason: from getter */
        public NextStep.CancelDialog getCancelDialog() {
            return this.cancelDialog;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: c, reason: from getter */
        public String getFromStep() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IntegrationStepRunning)) {
                return false;
            }
            IntegrationStepRunning integrationStepRunning = (IntegrationStepRunning) other;
            return p013kotlin.jvm.internal.s.f(this.inquiryId, integrationStepRunning.inquiryId) && p013kotlin.jvm.internal.s.f(this.sessionToken, integrationStepRunning.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, integrationStepRunning.transitionStatus) && p013kotlin.jvm.internal.s.f(this.styles, integrationStepRunning.styles) && p013kotlin.jvm.internal.s.f(this.cancelDialog, integrationStepRunning.cancelDialog) && p013kotlin.jvm.internal.s.f(this.type, integrationStepRunning.type) && p013kotlin.jvm.internal.s.f(this.flowUrl, integrationStepRunning.flowUrl) && p013kotlin.jvm.internal.s.f(this.localizations, integrationStepRunning.localizations) && p013kotlin.jvm.internal.s.f(this.inquiryStatus, integrationStepRunning.inquiryStatus) && p013kotlin.jvm.internal.s.f(this.stepName, integrationStepRunning.stepName) && this.backStepEnabled == integrationStepRunning.backStepEnabled && this.cancelButtonEnabled == integrationStepRunning.cancelButtonEnabled && p013kotlin.jvm.internal.s.f(this.clientSideKey, integrationStepRunning.clientSideKey) && p013kotlin.jvm.internal.s.f(this.integrationPage, integrationStepRunning.integrationPage) && p013kotlin.jvm.internal.s.f(this.transitionError, integrationStepRunning.transitionError) && p013kotlin.jvm.internal.s.f(this.inquirySessionConfig, integrationStepRunning.inquirySessionConfig);
        }

        public final IntegrationStepRunning g(String inquiryId, String sessionToken, v transitionStatus, StepStyles.IntegrationStepStyle styles, NextStep.CancelDialog cancelDialog, String type, String flowUrl, NextStep.Integration.Localizations localizations, String inquiryStatus, String stepName, boolean backStepEnabled, boolean cancelButtonEnabled, String clientSideKey, ah0.e integrationPage, InternalErrorInfo transitionError, InquirySessionConfig inquirySessionConfig) {
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(flowUrl, "flowUrl");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(clientSideKey, "clientSideKey");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            return new IntegrationStepRunning(inquiryId, sessionToken, transitionStatus, styles, cancelDialog, type, flowUrl, localizations, inquiryStatus, stepName, backStepEnabled, cancelButtonEnabled, clientSideKey, integrationPage, transitionError, inquirySessionConfig);
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = ((this.inquiryId.hashCode() * 31) + this.sessionToken.hashCode()) * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
            StepStyles.IntegrationStepStyle integrationStepStyle = this.styles;
            int iHashCode3 = (iHashCode2 + (integrationStepStyle == null ? 0 : integrationStepStyle.hashCode())) * 31;
            NextStep.CancelDialog cancelDialog = this.cancelDialog;
            int iHashCode4 = (((((iHashCode3 + (cancelDialog == null ? 0 : cancelDialog.hashCode())) * 31) + this.type.hashCode()) * 31) + this.flowUrl.hashCode()) * 31;
            NextStep.Integration.Localizations localizations = this.localizations;
            int iHashCode5 = (((((((((((iHashCode4 + (localizations == null ? 0 : localizations.hashCode())) * 31) + this.inquiryStatus.hashCode()) * 31) + this.stepName.hashCode()) * 31) + Boolean.hashCode(this.backStepEnabled)) * 31) + Boolean.hashCode(this.cancelButtonEnabled)) * 31) + this.clientSideKey.hashCode()) * 31;
            ah0.e eVar = this.integrationPage;
            int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            InternalErrorInfo internalErrorInfo = this.transitionError;
            return ((iHashCode6 + (internalErrorInfo != null ? internalErrorInfo.hashCode() : 0)) * 31) + this.inquirySessionConfig.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getBackStepEnabled() {
            return this.backStepEnabled;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final boolean getCancelButtonEnabled() {
            return this.cancelButtonEnabled;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getFlowUrl() {
            return this.flowUrl;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final ah0.e getIntegrationPage() {
            return this.integrationPage;
        }

        public final String m() {
            return this.stepName;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: r, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: s, reason: from getter */
        public StepStyles.IntegrationStepStyle getStyles() {
            return this.styles;
        }

        public String toString() {
            return "IntegrationStepRunning(inquiryId=" + this.inquiryId + ", sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", styles=" + this.styles + ", cancelDialog=" + this.cancelDialog + ", type=" + this.type + ", flowUrl=" + this.flowUrl + ", localizations=" + this.localizations + ", inquiryStatus=" + this.inquiryStatus + ", stepName=" + this.stepName + ", backStepEnabled=" + this.backStepEnabled + ", cancelButtonEnabled=" + this.cancelButtonEnabled + ", clientSideKey=" + this.clientSideKey + ", integrationPage=" + this.integrationPage + ", transitionError=" + this.transitionError + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final InternalErrorInfo getTransitionError() {
            return this.transitionError;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.inquiryId);
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeParcelable(this.styles, flags);
            dest.writeParcelable(this.cancelDialog, flags);
            dest.writeString(this.type);
            dest.writeString(this.flowUrl);
            dest.writeParcelable(this.localizations, flags);
            dest.writeString(this.inquiryStatus);
            dest.writeString(this.stepName);
            dest.writeInt(this.backStepEnabled ? 1 : 0);
            dest.writeInt(this.cancelButtonEnabled ? 1 : 0);
            dest.writeString(this.clientSideKey);
            dest.writeParcelable(this.integrationPage, flags);
            dest.writeParcelable(this.transitionError, flags);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegrationStepRunning(String inquiryId, String sessionToken, v vVar, StepStyles.IntegrationStepStyle integrationStepStyle, NextStep.CancelDialog cancelDialog, String type, String flowUrl, NextStep.Integration.Localizations localizations, String inquiryStatus, String stepName, boolean z11, boolean z12, String clientSideKey, ah0.e eVar, InternalErrorInfo internalErrorInfo, InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(type, "type");
            p013kotlin.jvm.internal.s.k(flowUrl, "flowUrl");
            p013kotlin.jvm.internal.s.k(inquiryStatus, "inquiryStatus");
            p013kotlin.jvm.internal.s.k(stepName, "stepName");
            p013kotlin.jvm.internal.s.k(clientSideKey, "clientSideKey");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            this.inquiryId = inquiryId;
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.styles = integrationStepStyle;
            this.cancelDialog = cancelDialog;
            this.type = type;
            this.flowUrl = flowUrl;
            this.localizations = localizations;
            this.inquiryStatus = inquiryStatus;
            this.stepName = stepName;
            this.backStepEnabled = z11;
            this.cancelButtonEnabled = z12;
            this.clientSideKey = clientSideKey;
            this.integrationPage = eVar;
            this.transitionError = internalErrorInfo;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    private l(String str, String str2, v vVar, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig) {
        this.sessionToken = str;
        this.inquiryId = str2;
        this.transitionStatus = vVar;
        this.styles = stepStyle;
        this.cancelDialog = cancelDialog;
        this.fromStep = str3;
        this.inquirySessionConfig = inquirySessionConfig;
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$k, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u001a\u0010\u001f\u001a\u00020\t2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b!\u00100R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/l$k;", "Lcom/withpersona/sdk2/inquiry/internal/l;", "", "sessionToken", "Lcom/withpersona/sdk2/inquiry/internal/v;", "transitionStatus", "inquiryId", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "", "useBasicSpinner", "Lhi0/g;", "inquirySessionConfig", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLhi0/g;)V", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "g", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/v;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ZLhi0/g;)Lcom/withpersona/sdk2/inquiry/internal/l$k;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "o", "j", "Lcom/withpersona/sdk2/inquiry/internal/v;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/internal/v;", "k", "q", "l", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "getStyles", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "m", "Z", "()Z", "n", "Lhi0/g;", "r", "()Lhi0/g;", "inquiry-internal_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowLoadingSpinner extends l {
        public static final Parcelable.Creator<ShowLoadingSpinner> CREATOR = new a();

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionToken;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final v transitionStatus;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String inquiryId;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final StepStyle styles;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean useBasicSpinner;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final InquirySessionConfig inquirySessionConfig;

        /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.internal.l$k$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShowLoadingSpinner> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner createFromParcel(Parcel parcel) {
                p013kotlin.jvm.internal.s.k(parcel, "parcel");
                return new ShowLoadingSpinner(parcel.readString(), (v) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readString(), (StepStyle) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()), parcel.readInt() != 0, (InquirySessionConfig) parcel.readParcelable(ShowLoadingSpinner.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final ShowLoadingSpinner[] newArray(int i11) {
                return new ShowLoadingSpinner[i11];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ ShowLoadingSpinner(String str, v vVar, String str2, StepStyle stepStyle, boolean z11, InquirySessionConfig inquirySessionConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? new v.CheckingForNextState(null, false, 3, 0 == true ? 1 : 0) : vVar, str2, stepStyle, z11, (i11 & 32) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig);
        }

        public static /* synthetic */ ShowLoadingSpinner h(ShowLoadingSpinner showLoadingSpinner, String str, v vVar, String str2, StepStyle stepStyle, boolean z11, InquirySessionConfig inquirySessionConfig, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = showLoadingSpinner.sessionToken;
            }
            if ((i11 & 2) != 0) {
                vVar = showLoadingSpinner.transitionStatus;
            }
            if ((i11 & 4) != 0) {
                str2 = showLoadingSpinner.inquiryId;
            }
            if ((i11 & 8) != 0) {
                stepStyle = showLoadingSpinner.styles;
            }
            if ((i11 & 16) != 0) {
                z11 = showLoadingSpinner.useBasicSpinner;
            }
            if ((i11 & 32) != 0) {
                inquirySessionConfig = showLoadingSpinner.inquirySessionConfig;
            }
            boolean z12 = z11;
            InquirySessionConfig inquirySessionConfig2 = inquirySessionConfig;
            return showLoadingSpinner.g(str, vVar, str2, stepStyle, z12, inquirySessionConfig2);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: d, reason: from getter */
        public v getTransitionStatus() {
            return this.transitionStatus;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShowLoadingSpinner)) {
                return false;
            }
            ShowLoadingSpinner showLoadingSpinner = (ShowLoadingSpinner) other;
            return p013kotlin.jvm.internal.s.f(this.sessionToken, showLoadingSpinner.sessionToken) && p013kotlin.jvm.internal.s.f(this.transitionStatus, showLoadingSpinner.transitionStatus) && p013kotlin.jvm.internal.s.f(this.inquiryId, showLoadingSpinner.inquiryId) && p013kotlin.jvm.internal.s.f(this.styles, showLoadingSpinner.styles) && this.useBasicSpinner == showLoadingSpinner.useBasicSpinner && p013kotlin.jvm.internal.s.f(this.inquirySessionConfig, showLoadingSpinner.inquirySessionConfig);
        }

        public final ShowLoadingSpinner g(String sessionToken, v transitionStatus, String inquiryId, StepStyle styles, boolean useBasicSpinner, InquirySessionConfig inquirySessionConfig) {
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            return new ShowLoadingSpinner(sessionToken, transitionStatus, inquiryId, styles, useBasicSpinner, inquirySessionConfig);
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        public StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.sessionToken.hashCode() * 31;
            v vVar = this.transitionStatus;
            int iHashCode2 = (((iHashCode + (vVar == null ? 0 : vVar.hashCode())) * 31) + this.inquiryId.hashCode()) * 31;
            StepStyle stepStyle = this.styles;
            return ((((iHashCode2 + (stepStyle != null ? stepStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.useBasicSpinner)) * 31) + this.inquirySessionConfig.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getUseBasicSpinner() {
            return this.useBasicSpinner;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: o, reason: from getter */
        public String getSessionToken() {
            return this.sessionToken;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l
        /* JADX INFO: renamed from: q, reason: from getter */
        public String getInquiryId() {
            return this.inquiryId;
        }

        @Override // com.withpersona.sdk2.inquiry.internal.l, bh0.r2
        /* JADX INFO: renamed from: r, reason: from getter */
        public InquirySessionConfig getInquirySessionConfig() {
            return this.inquirySessionConfig;
        }

        public String toString() {
            return "ShowLoadingSpinner(sessionToken=" + this.sessionToken + ", transitionStatus=" + this.transitionStatus + ", inquiryId=" + this.inquiryId + ", styles=" + this.styles + ", useBasicSpinner=" + this.useBasicSpinner + ", inquirySessionConfig=" + this.inquirySessionConfig + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            p013kotlin.jvm.internal.s.k(dest, "dest");
            dest.writeString(this.sessionToken);
            dest.writeParcelable(this.transitionStatus, flags);
            dest.writeString(this.inquiryId);
            dest.writeParcelable(this.styles, flags);
            dest.writeInt(this.useBasicSpinner ? 1 : 0);
            dest.writeParcelable(this.inquirySessionConfig, flags);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowLoadingSpinner(String sessionToken, v vVar, String inquiryId, StepStyle stepStyle, boolean z11, InquirySessionConfig inquirySessionConfig) {
            super(null, null, null, null, null, null, null, 127, null);
            p013kotlin.jvm.internal.s.k(sessionToken, "sessionToken");
            p013kotlin.jvm.internal.s.k(inquiryId, "inquiryId");
            p013kotlin.jvm.internal.s.k(inquirySessionConfig, "inquirySessionConfig");
            this.sessionToken = sessionToken;
            this.transitionStatus = vVar;
            this.inquiryId = inquiryId;
            this.styles = stepStyle;
            this.useBasicSpinner = z11;
            this.inquirySessionConfig = inquirySessionConfig;
        }
    }

    public /* synthetic */ l(String str, String str2, v vVar, StepStyle stepStyle, NextStep.CancelDialog cancelDialog, String str3, InquirySessionConfig inquirySessionConfig, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : vVar, (i11 & 8) != 0 ? null : stepStyle, (i11 & 16) != 0 ? null : cancelDialog, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? InquirySessionConfig.INSTANCE.a() : inquirySessionConfig, null);
    }
}
