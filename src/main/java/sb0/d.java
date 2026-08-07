package sb0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/a;", "Lsb0/c;", "a", "(La/a;)Lsb0/c;", "dashcam-viewer_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f111037a;

        static {
            int[] iArr = new int[a.a.d.values().length];
            try {
                iArr[a.a.d.GEAR_PARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.a.d.GEAR_DRIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.a.d.GEAR_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.a.d.GEAR_NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f111037a = iArr;
        }
    }

    public static final SEIMetadataProcessed a(a.a aVar) {
        String str;
        s.k(aVar, "<this>");
        long frame_seq_no = aVar.getFrame_seq_no();
        float fAbs = 2.23694f * Math.abs(aVar.getVehicle_speed_mps());
        float fAbs2 = 3.6f * Math.abs(aVar.getVehicle_speed_mps());
        float accelerator_pedal_position = aVar.getAccelerator_pedal_position();
        float accelerator_pedal_position2 = BitmapDescriptorFactory.HUE_RED;
        if (accelerator_pedal_position >= BitmapDescriptorFactory.HUE_RED) {
            accelerator_pedal_position2 = aVar.getAccelerator_pedal_position() / 100.0f;
        }
        float steering_wheel_angle = aVar.getSteering_wheel_angle();
        boolean blinker_on_left = aVar.getBlinker_on_left();
        boolean blinker_on_right = aVar.getBlinker_on_right();
        boolean brake_applied = aVar.getBrake_applied();
        boolean z11 = aVar.getAutopilot_state() == a.a.EnumC0001a.SELF_DRIVING;
        boolean z12 = aVar.getAutopilot_state() == a.a.EnumC0001a.AUTOSTEER;
        int i11 = a.f111037a[aVar.getGear_state().ordinal()];
        if (i11 == 1) {
            str = "P";
        } else if (i11 == 2) {
            str = "D";
        } else if (i11 == 3) {
            str = "R";
        } else {
            if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = Gender.NONE;
        }
        return new SEIMetadataProcessed(frame_seq_no, fAbs, fAbs2, accelerator_pedal_position2, steering_wheel_angle, blinker_on_left, blinker_on_right, brake_applied, z11, z12, str, true);
    }
}
