package py;

/* JADX INFO: loaded from: classes6.dex */
public class i {
    public void a(ry.g gVar, int i11) {
        com.henninghall.date_picker.pickers.a aVar = gVar.f109246d;
        int value = aVar.getValue();
        int maxValue = aVar.getMaxValue();
        boolean wrapSelectorWheel = aVar.getWrapSelectorWheel();
        int i12 = value + i11;
        if (i12 <= maxValue || wrapSelectorWheel) {
            aVar.c(i12 % (maxValue + 1));
        }
    }
}
