package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FormattingConverter<E> extends Converter<E> {
    static final int INITIAL_BUF_SIZE = 256;
    static final int MAX_CAPACITY = 1024;
    FormatInfo formattingInfo;

    public final FormatInfo getFormattingInfo() {
        return this.formattingInfo;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.formattingInfo != null) {
            throw new IllegalStateException("FormattingInfo has been already set");
        }
        this.formattingInfo = formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public final void write(StringBuilder sb2, E e11) {
        String strConvert = convert(e11);
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo == null) {
            sb2.append(strConvert);
            return;
        }
        int min = formatInfo.getMin();
        int max = this.formattingInfo.getMax();
        if (strConvert == null) {
            if (min > 0) {
                SpacePadder.spacePad(sb2, min);
                return;
            }
            return;
        }
        int length = strConvert.length();
        if (length > max) {
            sb2.append(this.formattingInfo.isLeftTruncate() ? strConvert.substring(length - max) : strConvert.substring(0, max));
            return;
        }
        if (length >= min) {
            sb2.append(strConvert);
        } else if (this.formattingInfo.isLeftPad()) {
            SpacePadder.leftPad(sb2, strConvert, min);
        } else {
            SpacePadder.rightPad(sb2, strConvert, min);
        }
    }
}
