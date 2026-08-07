package com.fourthline.vision.document.ocr;

import com.fourthline.core.internal.TimestampProvider;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import wn0.a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\n \f*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/fourthline/vision/document/ocr/OcrBirthDateValidator;", "Lcom/fourthline/vision/document/ocr/OcrValidator;", "Ljava/util/Date;", "Lcom/fourthline/core/internal/TimestampProvider;", "timestampProvider", "Lkotlin/Function0;", "", "minPersonAgeFactory", "<init>", "(Lcom/fourthline/core/internal/TimestampProvider;Lwn0/a;)V", InquiryField.DateField.TYPE, "addingYears", "kotlin.jvm.PlatformType", "getStartOfDay", "(Ljava/util/Date;Ljava/lang/Integer;)Ljava/util/Date;", "value", "", "Lcom/fourthline/vision/document/ocr/OcrValidationError;", "validate", "(Ljava/util/Date;)Ljava/util/Set;", "Lcom/fourthline/core/internal/TimestampProvider;", "Lwn0/a;", "fourthline-vision_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OcrBirthDateValidator implements OcrValidator<Date> {
    public static final int $stable = 8;
    private final a<Integer> minPersonAgeFactory;
    private final TimestampProvider timestampProvider;

    public OcrBirthDateValidator(TimestampProvider timestampProvider, a<Integer> minPersonAgeFactory) {
        s.k(timestampProvider, "timestampProvider");
        s.k(minPersonAgeFactory, "minPersonAgeFactory");
        this.timestampProvider = timestampProvider;
        this.minPersonAgeFactory = minPersonAgeFactory;
    }

    private final Date getStartOfDay(Date date, Integer addingYears) {
        Calendar currentCalendar = this.timestampProvider.getCurrentCalendar();
        currentCalendar.setTime(date);
        currentCalendar.set(11, 0);
        currentCalendar.set(12, 0);
        currentCalendar.set(13, 0);
        currentCalendar.set(14, 0);
        if (addingYears != null) {
            currentCalendar.add(1, addingYears.intValue());
        }
        return currentCalendar.getTime();
    }

    static /* synthetic */ Date getStartOfDay$default(OcrBirthDateValidator ocrBirthDateValidator, Date date, Integer num, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        return ocrBirthDateValidator.getStartOfDay(date, num);
    }

    @Override // com.fourthline.vision.document.ocr.OcrValidator
    public Set<OcrValidationError> validate(Date value) {
        s.k(value, "value");
        Date startOfDay$default = getStartOfDay$default(this, value, null, 2, null);
        Date startOfDay = getStartOfDay(new Date(), Integer.valueOf(-this.minPersonAgeFactory.invoke().intValue()));
        return (s.f(startOfDay$default, startOfDay) || startOfDay$default.before(startOfDay)) ? d1.d() : d1.c(OcrValidationError.PERSON_NOT_ADULT);
    }
}
