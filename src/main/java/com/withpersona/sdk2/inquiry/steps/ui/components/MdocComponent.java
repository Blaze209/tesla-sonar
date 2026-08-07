package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Mdoc;
import java.util.ArrayList;
import java.util.List;
import oi0.h;
import oi0.n5;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.f, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001\u001fBm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u001eJ\u0088\u0001\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b*\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\"R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b/\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b<\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b=\u0010)\u001a\u0004\b=\u0010\"R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b>\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010)\u001a\u0004\b1\u0010\"R(\u0010G\u001a\u00020&8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b?\u0010@\u0012\u0004\bE\u0010F\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010O\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bI\u0010J\u0012\u0004\bN\u0010F\u001a\u0004\b7\u0010K\"\u0004\bL\u0010MR(\u0010S\u001a\u00020H8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bP\u0010J\u0012\u0004\bR\u0010F\u001a\u0004\b3\u0010K\"\u0004\bQ\u0010MR&\u0010Z\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bV\u0010W\u0012\u0004\bY\u0010F\u001a\u0004\b;\u0010X¨\u0006\\"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "Loi0/n5;", "Loi0/h;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "autoSubmitCountdownText", "", "autoSubmitIntervalSeconds", "Lti0/a;", "mdocRequestMetadata", "errorRetrievingMdocText", "noMdocAvailableText", "successfulMdocRetrievalTransitionComponentName", "mdocData", "errorText", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Lti0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "k", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "j", "Landroid/os/Parcel;", "dest", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Ljava/lang/String;Ljava/lang/Integer;Lti0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "c", "getDisabled", DateTokenConverter.CONVERTER_KEY, "getAutoSubmitCountdownText", "e", "Ljava/lang/Integer;", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "f", "Lti0/a;", "g", "()Lti0/a;", "h", "getNoMdocAvailableText", IntegerTokenConverter.CONVERTER_KEY, "getMdocData", "l", "Z", "u2", "()Z", "B", "(Z)V", "getWasTapped$annotations", "()V", "wasTapped", "La30/t;", "m", "La30/t;", "()La30/t;", "setMdocDataController", "(La30/t;)V", "getMdocDataController$annotations", "mdocDataController", "n", "setErrorTextController", "getErrorTextController$annotations", "errorTextController", "", "Lxi0/a;", "o", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "associatedViews", "p", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MdocComponent implements n5, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String autoSubmitCountdownText;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer autoSubmitIntervalSeconds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ti0.a mdocRequestMetadata;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorRetrievingMdocText;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String noMdocAvailableText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String successfulMdocRetrievalTransitionComponentName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mdocData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorText;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean wasTapped;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t mdocDataController;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private t errorTextController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MdocComponent> CREATOR = new b();

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/f$a;", "", "<init>", "()V", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;", "config", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Mdoc;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/f;", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MdocComponent a(Mdoc config) {
            Mdoc.Provider provider;
            ti0.a aVarA;
            String errorRetrievingMdocText;
            String noMdocAvailableText;
            s.k(config, "config");
            String name = config.getName();
            Mdoc.Attributes attributes = config.getAttributes();
            JsonLogicBoolean hidden = attributes != null ? attributes.getHidden() : null;
            Mdoc.Attributes attributes2 = config.getAttributes();
            JsonLogicBoolean disabled = attributes2 != null ? attributes2.getDisabled() : null;
            Mdoc.Attributes attributes3 = config.getAttributes();
            String autoSubmitCountdownText = attributes3 != null ? attributes3.getAutoSubmitCountdownText() : null;
            Mdoc.Attributes attributes4 = config.getAttributes();
            Integer autoSubmitIntervalSeconds = attributes4 != null ? attributes4.getAutoSubmitIntervalSeconds() : null;
            Mdoc.Attributes attributes5 = config.getAttributes();
            if (attributes5 == null || (provider = attributes5.getProvider()) == null || (aVarA = ti0.b.a(provider)) == null) {
                return null;
            }
            Mdoc.Attributes attributes6 = config.getAttributes();
            String str = "";
            if (attributes6 == null || (errorRetrievingMdocText = attributes6.getErrorRetrievingMdocText()) == null) {
                errorRetrievingMdocText = "";
            }
            Mdoc.Attributes attributes7 = config.getAttributes();
            if (attributes7 != null && (noMdocAvailableText = attributes7.getNoMdocAvailableText()) != null) {
                str = noMdocAvailableText;
            }
            Mdoc.Attributes attributes8 = config.getAttributes();
            return new MdocComponent(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, aVarA, errorRetrievingMdocText, str, attributes8 != null ? attributes8.getSuccessfulMdocRetrievalTransitionComponentName() : null, null, null, 1536, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.f$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<MdocComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MdocComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new MdocComponent(parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (ti0.a) parcel.readParcelable(MdocComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MdocComponent[] newArray(int i11) {
            return new MdocComponent[i11];
        }
    }

    public MdocComponent(String name, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str, Integer num, ti0.a mdocRequestMetadata, String errorRetrievingMdocText, String noMdocAvailableText, String str2, String mdocData, String errorText) {
        s.k(name, "name");
        s.k(mdocRequestMetadata, "mdocRequestMetadata");
        s.k(errorRetrievingMdocText, "errorRetrievingMdocText");
        s.k(noMdocAvailableText, "noMdocAvailableText");
        s.k(mdocData, "mdocData");
        s.k(errorText, "errorText");
        this.name = name;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autoSubmitCountdownText = str;
        this.autoSubmitIntervalSeconds = num;
        this.mdocRequestMetadata = mdocRequestMetadata;
        this.errorRetrievingMdocText = errorRetrievingMdocText;
        this.noMdocAvailableText = noMdocAvailableText;
        this.successfulMdocRetrievalTransitionComponentName = str2;
        this.mdocData = mdocData;
        this.errorText = errorText;
        this.mdocDataController = w.a(mdocData);
        this.errorTextController = w.a(errorText);
        this.associatedViews = new ArrayList();
    }

    public static /* synthetic */ MdocComponent b(MdocComponent mdocComponent, String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, ti0.a aVar, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = mdocComponent.name;
        }
        if ((i11 & 2) != 0) {
            jsonLogicBoolean = mdocComponent.hidden;
        }
        if ((i11 & 4) != 0) {
            jsonLogicBoolean2 = mdocComponent.disabled;
        }
        if ((i11 & 8) != 0) {
            str2 = mdocComponent.autoSubmitCountdownText;
        }
        if ((i11 & 16) != 0) {
            num = mdocComponent.autoSubmitIntervalSeconds;
        }
        if ((i11 & 32) != 0) {
            aVar = mdocComponent.mdocRequestMetadata;
        }
        if ((i11 & 64) != 0) {
            str3 = mdocComponent.errorRetrievingMdocText;
        }
        if ((i11 & 128) != 0) {
            str4 = mdocComponent.noMdocAvailableText;
        }
        if ((i11 & 256) != 0) {
            str5 = mdocComponent.successfulMdocRetrievalTransitionComponentName;
        }
        if ((i11 & 512) != 0) {
            str6 = mdocComponent.mdocData;
        }
        if ((i11 & 1024) != 0) {
            str7 = mdocComponent.errorText;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str4;
        String str11 = str5;
        ti0.a aVar2 = aVar;
        String str12 = str3;
        Integer num2 = num;
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        return mdocComponent.a(str, jsonLogicBoolean, jsonLogicBoolean3, str2, num2, aVar2, str12, str10, str11, str8, str9);
    }

    @Override // oi0.h, oi0.j2
    public void B(boolean z11) {
        this.wasTapped = z11;
    }

    public final MdocComponent a(String name, JsonLogicBoolean hidden, JsonLogicBoolean disabled, String autoSubmitCountdownText, Integer autoSubmitIntervalSeconds, ti0.a mdocRequestMetadata, String errorRetrievingMdocText, String noMdocAvailableText, String successfulMdocRetrievalTransitionComponentName, String mdocData, String errorText) {
        s.k(name, "name");
        s.k(mdocRequestMetadata, "mdocRequestMetadata");
        s.k(errorRetrievingMdocText, "errorRetrievingMdocText");
        s.k(noMdocAvailableText, "noMdocAvailableText");
        s.k(mdocData, "mdocData");
        s.k(errorText, "errorText");
        return new MdocComponent(name, hidden, disabled, autoSubmitCountdownText, autoSubmitIntervalSeconds, mdocRequestMetadata, errorRetrievingMdocText, noMdocAvailableText, successfulMdocRetrievalTransitionComponentName, mdocData, errorText);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getErrorRetrievingMdocText() {
        return this.errorRetrievingMdocText;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getErrorText() {
        return this.errorText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final t getErrorTextController() {
        return this.errorTextController;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MdocComponent)) {
            return false;
        }
        MdocComponent mdocComponent = (MdocComponent) other;
        return s.f(this.name, mdocComponent.name) && s.f(this.hidden, mdocComponent.hidden) && s.f(this.disabled, mdocComponent.disabled) && s.f(this.autoSubmitCountdownText, mdocComponent.autoSubmitCountdownText) && s.f(this.autoSubmitIntervalSeconds, mdocComponent.autoSubmitIntervalSeconds) && s.f(this.mdocRequestMetadata, mdocComponent.mdocRequestMetadata) && s.f(this.errorRetrievingMdocText, mdocComponent.errorRetrievingMdocText) && s.f(this.noMdocAvailableText, mdocComponent.noMdocAvailableText) && s.f(this.successfulMdocRetrievalTransitionComponentName, mdocComponent.successfulMdocRetrievalTransitionComponentName) && s.f(this.mdocData, mdocComponent.mdocData) && s.f(this.errorText, mdocComponent.errorText);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getMdocDataController() {
        return this.mdocDataController;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ti0.a getMdocRequestMetadata() {
        return this.mdocRequestMetadata;
    }

    @Override // oi0.h
    public String getAutoSubmitCountdownText() {
        return this.autoSubmitCountdownText;
    }

    @Override // oi0.h
    public Integer getAutoSubmitIntervalSeconds() {
        return this.autoSubmitIntervalSeconds;
    }

    @Override // oi0.v
    public JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // oi0.e0
    public JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // oi0.n5
    public String getName() {
        return this.name;
    }

    @Override // oi0.e0
    public List<xi0.a> h() {
        return this.associatedViews;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode2 = (iHashCode + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode3 = (iHashCode2 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        String str = this.autoSubmitCountdownText;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.autoSubmitIntervalSeconds;
        int iHashCode5 = (((((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.mdocRequestMetadata.hashCode()) * 31) + this.errorRetrievingMdocText.hashCode()) * 31) + this.noMdocAvailableText.hashCode()) * 31;
        String str2 = this.successfulMdocRetrievalTransitionComponentName;
        return ((((iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.mdocData.hashCode()) * 31) + this.errorText.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSuccessfulMdocRetrievalTransitionComponentName() {
        return this.successfulMdocRetrievalTransitionComponentName;
    }

    public final MdocComponent j(String errorText) {
        s.k(errorText, "errorText");
        MdocComponent mdocComponentB = b(this, null, null, null, null, null, null, null, null, null, null, errorText, 1023, null);
        mdocComponentB.mdocDataController = this.mdocDataController;
        mdocComponentB.errorTextController = this.errorTextController;
        return mdocComponentB;
    }

    public final MdocComponent k(String mdocData) {
        s.k(mdocData, "mdocData");
        MdocComponent mdocComponentB = b(this, null, null, null, null, null, null, null, null, null, mdocData, null, 1535, null);
        mdocComponentB.mdocDataController = this.mdocDataController;
        mdocComponentB.errorTextController = this.errorTextController;
        return mdocComponentB;
    }

    public String toString() {
        return "MdocComponent(name=" + this.name + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", autoSubmitCountdownText=" + this.autoSubmitCountdownText + ", autoSubmitIntervalSeconds=" + this.autoSubmitIntervalSeconds + ", mdocRequestMetadata=" + this.mdocRequestMetadata + ", errorRetrievingMdocText=" + this.errorRetrievingMdocText + ", noMdocAvailableText=" + this.noMdocAvailableText + ", successfulMdocRetrievalTransitionComponentName=" + this.successfulMdocRetrievalTransitionComponentName + ", mdocData=" + this.mdocData + ", errorText=" + this.errorText + ")";
    }

    @Override // oi0.h
    /* JADX INFO: renamed from: u2, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iIntValue;
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        dest.writeString(this.autoSubmitCountdownText);
        Integer num = this.autoSubmitIntervalSeconds;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeParcelable(this.mdocRequestMetadata, flags);
        dest.writeString(this.errorRetrievingMdocText);
        dest.writeString(this.noMdocAvailableText);
        dest.writeString(this.successfulMdocRetrievalTransitionComponentName);
        dest.writeString(this.mdocData);
        dest.writeString(this.errorText);
    }

    public /* synthetic */ MdocComponent(String str, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, String str2, Integer num, ti0.a aVar, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, jsonLogicBoolean, jsonLogicBoolean2, str2, num, aVar, str3, str4, str5, (i11 & 512) != 0 ? "" : str6, (i11 & 1024) != 0 ? "" : str7);
    }
}
