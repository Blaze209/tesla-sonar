package com.fourthline.vision.document.ocr;

import com.fourthline.core.DocumentType;
import com.fourthline.core.internal.TimestampProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000f\u001a\u00020\u0010*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrDocumentExpirationDateValidator;", "Lcom/fourthline/vision/document/ocr/OcrValidator;", "Lcom/fourthline/vision/document/ocr/ExpirationDateData;", "timestampProvider", "Lcom/fourthline/core/internal/TimestampProvider;", "<init>", "(Lcom/fourthline/core/internal/TimestampProvider;)V", "startOfTheDay", "Ljava/util/Date;", "getStartOfTheDay", "()Ljava/util/Date;", "validate", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "value", "isExpired", "", "(Ljava/util/Date;)Z", "Companion", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OcrDocumentExpirationDateValidator implements OcrValidator<ExpirationDateData> {
    private static final String CodeFrance = "FRA";
    private final TimestampProvider timestampProvider;
    public static final int $stable = 8;

    public OcrDocumentExpirationDateValidator(TimestampProvider timestampProvider) {
        s.k(timestampProvider, "timestampProvider");
        this.timestampProvider = timestampProvider;
    }

    private final Date getStartOfTheDay() {
        Calendar currentCalendar = this.timestampProvider.getCurrentCalendar();
        currentCalendar.set(11, 0);
        currentCalendar.set(12, 0);
        currentCalendar.set(13, 0);
        currentCalendar.set(14, 0);
        Date time = currentCalendar.getTime();
        s.j(time, "getTime(...)");
        return time;
    }

    private final boolean isExpired(Date date) {
        return date.before(getStartOfTheDay());
    }

    @Override // com.fourthline.vision.document.ocr.OcrValidator
    public Set<OcrValidationError> validate(ExpirationDateData value) {
        s.k(value, "value");
        if ((s.f(value.getIssuingCountry(), CodeFrance) && value.getDocumentType() == DocumentType.ID_CARD) || value.getDocumentType() == DocumentType.FRENCH_ID_CARD) {
            return d1.d();
        }
        return isExpired(value.getDate()) ? d1.c(OcrValidationError.DOCUMENT_EXPIRED) : d1.d();
    }
}
