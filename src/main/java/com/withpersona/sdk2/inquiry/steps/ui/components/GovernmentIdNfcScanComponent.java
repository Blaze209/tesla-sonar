package com.withpersona.sdk2.inquiry.steps.ui.components;

import a30.t;
import a30.w;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.GovernmentIdNfcScan;
import java.util.ArrayList;
import java.util.List;
import oi0.e0;
import oi0.j2;
import oi0.n5;
import oi0.v;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import pi0.GovernmentIdNfcData;
import pi0.i;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B[\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001b\u0010\u0017J\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\b2\u0010*R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010*R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b9\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u0010*R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b<\u00101\u001a\u0004\b=\u0010*R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\bC\u0010AR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR&\u0010N\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010J\u0012\u0004\bL\u0010M\u001a\u0004\bB\u0010KR(\u0010U\u001a\u00020.8\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0004\b\u001a\u0010O\u0012\u0004\bT\u0010M\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR(\u0010\\\u001a\u00020V8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010W\u0012\u0004\b[\u0010M\u001a\u0004\b7\u0010X\"\u0004\bY\u0010ZR(\u0010_\u001a\u00020V8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001b\u0010W\u0012\u0004\b^\u0010M\u001a\u0004\b<\u0010X\"\u0004\b]\u0010ZR(\u0010g\u001a\u00020`8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bf\u0010M\u001a\u0004\b:\u0010c\"\u0004\bd\u0010eR(\u0010k\u001a\u00020`8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bh\u0010b\u0012\u0004\bj\u0010M\u001a\u0004\b>\u0010c\"\u0004\bi\u0010eR(\u0010s\u001a\u00020l8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bm\u0010n\u0012\u0004\br\u0010M\u001a\u0004\bD\u0010o\"\u0004\bp\u0010q¨\u0006t"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Loi0/n5;", "Loi0/v;", "Loi0/e0;", "Loi0/j2;", "", "name", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "config", "documentNumber", "dateOfBirth", "expirationDate", "cardAccessNumber", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "hidden", "disabled", "Lpi0/h;", "governmentIdNfcData", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lpi0/h;)V", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;)V", "newValue", "j", "(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "l", "newDate", "k", "m", "q", "(Lpi0/h;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "Landroid/os/Parcel;", "dest", "", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;Lpi0/h;)Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "b", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", DateTokenConverter.CONVERTER_KEY, "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan;", "c", "getDocumentNumber", "getDateOfBirth", "e", "getExpirationDate", "f", "getCardAccessNumber", "g", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "h", "getDisabled", IntegerTokenConverter.CONVERTER_KEY, "Lpi0/h;", "getGovernmentIdNfcData", "()Lpi0/h;", "", "Lxi0/a;", "Ljava/util/List;", "()Ljava/util/List;", "getAssociatedViews$annotations", "()V", "associatedViews", "Z", "u2", "()Z", "B", "(Z)V", "getWasTapped$annotations", "wasTapped", "La30/t;", "La30/t;", "()La30/t;", "setCardAccessNumberController", "(La30/t;)V", "getCardAccessNumberController$annotations", "cardAccessNumberController", "setDocumentNumberController", "getDocumentNumberController$annotations", "documentNumberController", "Lpi0/f;", "n", "Lpi0/f;", "()Lpi0/f;", "setDateOfBirthController", "(Lpi0/f;)V", "getDateOfBirthController$annotations", "dateOfBirthController", "o", "setExpirationDateController", "getExpirationDateController$annotations", "expirationDateController", "Lpi0/i;", "p", "Lpi0/i;", "()Lpi0/i;", "setNfcDataController", "(Lpi0/i;)V", "getNfcDataController$annotations", "nfcDataController", "ui-step-renderer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GovernmentIdNfcScanComponent implements n5, v, e0, j2 {
    public static final Parcelable.Creator<GovernmentIdNfcScanComponent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final GovernmentIdNfcScan config;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String documentNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dateOfBirth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAccessNumber;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean hidden;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final JsonLogicBoolean disabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final GovernmentIdNfcData governmentIdNfcData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<xi0.a> associatedViews;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean wasTapped;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private t cardAccessNumberController;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private t documentNumberController;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private pi0.f dateOfBirthController;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private pi0.f expirationDateController;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private i nfcDataController;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdNfcScanComponent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcScanComponent createFromParcel(Parcel parcel) {
            s.k(parcel, "parcel");
            return new GovernmentIdNfcScanComponent(parcel.readString(), (GovernmentIdNfcScan) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), (JsonLogicBoolean) parcel.readParcelable(GovernmentIdNfcScanComponent.class.getClassLoader()), parcel.readInt() == 0 ? null : GovernmentIdNfcData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GovernmentIdNfcScanComponent[] newArray(int i11) {
            return new GovernmentIdNfcScanComponent[i11];
        }
    }

    public GovernmentIdNfcScanComponent(String name, GovernmentIdNfcScan config, String documentNumber, String str, String str2, String cardAccessNumber, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData) {
        s.k(name, "name");
        s.k(config, "config");
        s.k(documentNumber, "documentNumber");
        s.k(cardAccessNumber, "cardAccessNumber");
        this.name = name;
        this.config = config;
        this.documentNumber = documentNumber;
        this.dateOfBirth = str;
        this.expirationDate = str2;
        this.cardAccessNumber = cardAccessNumber;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.governmentIdNfcData = governmentIdNfcData;
        this.associatedViews = new ArrayList();
        this.cardAccessNumberController = w.a(cardAccessNumber);
        this.documentNumberController = w.a(documentNumber);
        GovernmentIdNfcScan.Companion companion = GovernmentIdNfcScan.INSTANCE;
        this.dateOfBirthController = new pi0.f(str, null, companion.generateTextMonths());
        this.expirationDateController = new pi0.f(str2, null, companion.generateTextMonths());
        this.nfcDataController = new i(governmentIdNfcData);
    }

    public static /* synthetic */ GovernmentIdNfcScanComponent b(GovernmentIdNfcScanComponent governmentIdNfcScanComponent, String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = governmentIdNfcScanComponent.name;
        }
        if ((i11 & 2) != 0) {
            governmentIdNfcScan = governmentIdNfcScanComponent.config;
        }
        if ((i11 & 4) != 0) {
            str2 = governmentIdNfcScanComponent.documentNumber;
        }
        if ((i11 & 8) != 0) {
            str3 = governmentIdNfcScanComponent.dateOfBirth;
        }
        if ((i11 & 16) != 0) {
            str4 = governmentIdNfcScanComponent.expirationDate;
        }
        if ((i11 & 32) != 0) {
            str5 = governmentIdNfcScanComponent.cardAccessNumber;
        }
        if ((i11 & 64) != 0) {
            jsonLogicBoolean = governmentIdNfcScanComponent.hidden;
        }
        if ((i11 & 128) != 0) {
            jsonLogicBoolean2 = governmentIdNfcScanComponent.disabled;
        }
        if ((i11 & 256) != 0) {
            governmentIdNfcData = governmentIdNfcScanComponent.governmentIdNfcData;
        }
        JsonLogicBoolean jsonLogicBoolean3 = jsonLogicBoolean2;
        GovernmentIdNfcData governmentIdNfcData2 = governmentIdNfcData;
        String str6 = str5;
        JsonLogicBoolean jsonLogicBoolean4 = jsonLogicBoolean;
        String str7 = str4;
        String str8 = str2;
        return governmentIdNfcScanComponent.a(str, governmentIdNfcScan, str8, str3, str7, str6, jsonLogicBoolean4, jsonLogicBoolean3, governmentIdNfcData2);
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getCardAccessNumberController$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getDateOfBirthController$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getDocumentNumberController$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getExpirationDateController$annotations() {
    }

    @com.squareup.moshi.g(ignore = true)
    public static /* synthetic */ void getNfcDataController$annotations() {
    }

    @Override // oi0.j2
    public void B(boolean z11) {
        this.wasTapped = z11;
    }

    public final GovernmentIdNfcScanComponent a(String name, GovernmentIdNfcScan config, String documentNumber, String dateOfBirth, String expirationDate, String cardAccessNumber, JsonLogicBoolean hidden, JsonLogicBoolean disabled, GovernmentIdNfcData governmentIdNfcData) {
        s.k(name, "name");
        s.k(config, "config");
        s.k(documentNumber, "documentNumber");
        s.k(cardAccessNumber, "cardAccessNumber");
        return new GovernmentIdNfcScanComponent(name, config, documentNumber, dateOfBirth, expirationDate, cardAccessNumber, hidden, disabled, governmentIdNfcData);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t getCardAccessNumberController() {
        return this.cardAccessNumberController;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GovernmentIdNfcScan getConfig() {
        return this.config;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final pi0.f getDateOfBirthController() {
        return this.dateOfBirthController;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdNfcScanComponent)) {
            return false;
        }
        GovernmentIdNfcScanComponent governmentIdNfcScanComponent = (GovernmentIdNfcScanComponent) other;
        return s.f(this.name, governmentIdNfcScanComponent.name) && s.f(this.config, governmentIdNfcScanComponent.config) && s.f(this.documentNumber, governmentIdNfcScanComponent.documentNumber) && s.f(this.dateOfBirth, governmentIdNfcScanComponent.dateOfBirth) && s.f(this.expirationDate, governmentIdNfcScanComponent.expirationDate) && s.f(this.cardAccessNumber, governmentIdNfcScanComponent.cardAccessNumber) && s.f(this.hidden, governmentIdNfcScanComponent.hidden) && s.f(this.disabled, governmentIdNfcScanComponent.disabled) && s.f(this.governmentIdNfcData, governmentIdNfcScanComponent.governmentIdNfcData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getDocumentNumberController() {
        return this.documentNumberController;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final pi0.f getExpirationDateController() {
        return this.expirationDateController;
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
        int iHashCode = ((((this.name.hashCode() * 31) + this.config.hashCode()) * 31) + this.documentNumber.hashCode()) * 31;
        String str = this.dateOfBirth;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expirationDate;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.cardAccessNumber.hashCode()) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int iHashCode4 = (iHashCode3 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int iHashCode5 = (iHashCode4 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31;
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        return iHashCode5 + (governmentIdNfcData != null ? governmentIdNfcData.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final i getNfcDataController() {
        return this.nfcDataController;
    }

    public final GovernmentIdNfcScanComponent j(String newValue) {
        s.k(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, null, null, newValue, null, null, null, 479, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public final GovernmentIdNfcScanComponent k(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, newDate, null, null, null, null, null, 503, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public final GovernmentIdNfcScanComponent l(String newValue) {
        s.k(newValue, "newValue");
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, newValue, null, null, null, null, null, null, 507, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public final GovernmentIdNfcScanComponent m(String newDate) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, null, newDate, null, null, null, null, DownloaderService.STATUS_HTTP_DATA_ERROR, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public final GovernmentIdNfcScanComponent q(GovernmentIdNfcData newValue) {
        GovernmentIdNfcScanComponent governmentIdNfcScanComponentB = b(this, null, null, null, null, null, null, null, null, newValue, 255, null);
        governmentIdNfcScanComponentB.cardAccessNumberController = this.cardAccessNumberController;
        governmentIdNfcScanComponentB.documentNumberController = this.documentNumberController;
        governmentIdNfcScanComponentB.dateOfBirthController = this.dateOfBirthController;
        governmentIdNfcScanComponentB.expirationDateController = this.expirationDateController;
        governmentIdNfcScanComponentB.nfcDataController = this.nfcDataController;
        return governmentIdNfcScanComponentB;
    }

    public String toString() {
        return "GovernmentIdNfcScanComponent(name=" + this.name + ", config=" + this.config + ", documentNumber=" + this.documentNumber + ", dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ", cardAccessNumber=" + this.cardAccessNumber + ", hidden=" + this.hidden + ", disabled=" + this.disabled + ", governmentIdNfcData=" + this.governmentIdNfcData + ")";
    }

    /* JADX INFO: renamed from: u2, reason: from getter */
    public boolean getWasTapped() {
        return this.wasTapped;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        s.k(dest, "dest");
        dest.writeString(this.name);
        dest.writeParcelable(this.config, flags);
        dest.writeString(this.documentNumber);
        dest.writeString(this.dateOfBirth);
        dest.writeString(this.expirationDate);
        dest.writeString(this.cardAccessNumber);
        dest.writeParcelable(this.hidden, flags);
        dest.writeParcelable(this.disabled, flags);
        GovernmentIdNfcData governmentIdNfcData = this.governmentIdNfcData;
        if (governmentIdNfcData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            governmentIdNfcData.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ GovernmentIdNfcScanComponent(String str, GovernmentIdNfcScan governmentIdNfcScan, String str2, String str3, String str4, String str5, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, GovernmentIdNfcData governmentIdNfcData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, governmentIdNfcScan, str2, str3, str4, str5, jsonLogicBoolean, jsonLogicBoolean2, (i11 & 256) != 0 ? null : governmentIdNfcData);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GovernmentIdNfcScanComponent(GovernmentIdNfcScan config) {
        String prefillCardAccessNumber;
        String prefillDocumentNumber;
        s.k(config, "config");
        String name = config.getName();
        GovernmentIdNfcScan.Attributes attributes = config.getAttributes();
        String str = (attributes == null || (prefillDocumentNumber = attributes.getPrefillDocumentNumber()) == null) ? "" : prefillDocumentNumber;
        GovernmentIdNfcScan.Attributes attributes2 = config.getAttributes();
        String prefillDateOfBirth = attributes2 != null ? attributes2.getPrefillDateOfBirth() : null;
        GovernmentIdNfcScan.Attributes attributes3 = config.getAttributes();
        String prefillExpirationDate = attributes3 != null ? attributes3.getPrefillExpirationDate() : null;
        GovernmentIdNfcScan.Attributes attributes4 = config.getAttributes();
        String str2 = (attributes4 == null || (prefillCardAccessNumber = attributes4.getPrefillCardAccessNumber()) == null) ? "" : prefillCardAccessNumber;
        GovernmentIdNfcScan.Attributes attributes5 = config.getAttributes();
        JsonLogicBoolean hidden = attributes5 != null ? attributes5.getHidden() : null;
        GovernmentIdNfcScan.Attributes attributes6 = config.getAttributes();
        this(name, config, str, prefillDateOfBirth, prefillExpirationDate, str2, hidden, attributes6 != null ? attributes6.getDisabled() : null, null, 256, null);
    }
}
