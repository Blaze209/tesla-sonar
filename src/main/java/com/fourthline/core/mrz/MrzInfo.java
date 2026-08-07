package com.fourthline.core.mrz;

import com.fourthline.core.mrz.internal.a;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001f\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/fourthline/core/mrz/MrzInfo;", "", "", "rawMrz", "", "Lcom/fourthline/core/mrz/ValidationError;", "validationErrors", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "Ljava/lang/String;", "getRawMrz", "()Ljava/lang/String;", "b", "Ljava/util/List;", "getValidationErrors", "()Ljava/util/List;", "Companion", "Lcom/fourthline/core/mrz/IdlMrzInfo;", "Lcom/fourthline/core/mrz/MrtdMrzInfo;", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MrzInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String rawMrz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List validationErrors;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/core/mrz/MrzInfo$Companion;", "", "<init>", "()V", "create", "Lcom/fourthline/core/mrz/MrzInfo;", "from", "", "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MrzInfo create(String from) {
            s.k(from, "from");
            try {
                return new a().b(from);
            } catch (Throwable unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ MrzInfo(String str, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list);
    }

    public static final MrzInfo create(String str) {
        return INSTANCE.create(str);
    }

    public String getRawMrz() {
        return this.rawMrz;
    }

    public List<ValidationError> getValidationErrors() {
        return this.validationErrors;
    }

    private MrzInfo(String str, List list) {
        this.rawMrz = str;
        this.validationErrors = list;
    }
}
