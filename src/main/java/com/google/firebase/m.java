package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes5.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f44183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f44184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f44185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f44186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f44187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f44188g;

    private m(@NonNull String str, @NonNull String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f44183b = str;
        this.f44182a = str2;
        this.f44184c = str3;
        this.f44185d = str4;
        this.f44186e = str5;
        this.f44187f = str6;
        this.f44188g = str7;
    }

    public static m a(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new m(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    @NonNull
    public String b() {
        return this.f44182a;
    }

    @NonNull
    public String c() {
        return this.f44183b;
    }

    public String d() {
        return this.f44186e;
    }

    public String e() {
        return this.f44188g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Objects.equal(this.f44183b, mVar.f44183b) && Objects.equal(this.f44182a, mVar.f44182a) && Objects.equal(this.f44184c, mVar.f44184c) && Objects.equal(this.f44185d, mVar.f44185d) && Objects.equal(this.f44186e, mVar.f44186e) && Objects.equal(this.f44187f, mVar.f44187f) && Objects.equal(this.f44188g, mVar.f44188g);
    }

    public int hashCode() {
        return Objects.hashCode(this.f44183b, this.f44182a, this.f44184c, this.f44185d, this.f44186e, this.f44187f, this.f44188g);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f44183b).add("apiKey", this.f44182a).add("databaseUrl", this.f44184c).add("gcmSenderId", this.f44186e).add("storageBucket", this.f44187f).add("projectId", this.f44188g).toString();
    }
}
