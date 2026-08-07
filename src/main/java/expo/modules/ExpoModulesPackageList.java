package expo.modules;

import expo.modules.adapters.react.ReactAdapterPackage;
import expo.modules.asset.AssetModule;
import expo.modules.battery.BatteryModule;
import expo.modules.blur.BlurModule;
import expo.modules.calendar.CalendarModule;
import expo.modules.constants.ConstantsModule;
import expo.modules.constants.ConstantsPackage;
import expo.modules.contacts.ContactsModule;
import expo.modules.core.BasePackage;
import expo.modules.core.interfaces.Package;
import expo.modules.crypto.CryptoModule;
import expo.modules.fetch.ExpoFetchModule;
import expo.modules.filesystem.FileSystemModule;
import expo.modules.filesystem.FileSystemPackage;
import expo.modules.filesystem.next.FileSystemNextModule;
import expo.modules.font.FontLoaderModule;
import expo.modules.font.FontUtilsModule;
import expo.modules.haptics.HapticsModule;
import expo.modules.imageloader.ImageLoaderPackage;
import expo.modules.imagemanipulator.ImageManipulatorModule;
import expo.modules.imagepicker.ImagePickerModule;
import expo.modules.keepawake.KeepAwakeModule;
import expo.modules.keepawake.KeepAwakePackage;
import expo.modules.kotlin.ModulesProvider;
import expo.modules.kotlin.modules.Module;
import expo.modules.lineargradient.LinearGradientModule;
import expo.modules.location.LocationModule;
import expo.modules.mailcomposer.MailComposerModule;
import expo.modules.medialibrary.MediaLibraryModule;
import expo.modules.screencapture.ScreenCaptureModule;
import expo.modules.screenorientation.ScreenOrientationModule;
import expo.modules.sensors.modules.AccelerometerModule;
import expo.modules.sensors.modules.BarometerModule;
import expo.modules.sensors.modules.DeviceMotionModule;
import expo.modules.sensors.modules.GyroscopeModule;
import expo.modules.sensors.modules.LightSensorModule;
import expo.modules.sensors.modules.MagnetometerModule;
import expo.modules.sensors.modules.MagnetometerUncalibratedModule;
import expo.modules.sensors.modules.PedometerModule;
import expo.modules.sms.SMSModule;
import expo.modules.videothumbnails.VideoThumbnailsModule;
import expo.modules.webbrowser.WebBrowserModule;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ExpoModulesPackageList implements ModulesProvider {

    private static class LazyHolder {
        static final List<Package> packagesList = Arrays.asList(new ReactAdapterPackage(), new ConstantsPackage(), new BasePackage(), new FileSystemPackage(), new ImageLoaderPackage(), new KeepAwakePackage());
        static final List<Class<? extends Module>> modulesList = Arrays.asList(ExpoFetchModule.class, AssetModule.class, BatteryModule.class, BlurModule.class, CalendarModule.class, ConstantsModule.class, ContactsModule.class, CryptoModule.class, FileSystemModule.class, FileSystemNextModule.class, FontLoaderModule.class, FontUtilsModule.class, HapticsModule.class, ImageManipulatorModule.class, ImagePickerModule.class, KeepAwakeModule.class, LinearGradientModule.class, LocationModule.class, MailComposerModule.class, MediaLibraryModule.class, ScreenCaptureModule.class, ScreenOrientationModule.class, AccelerometerModule.class, BarometerModule.class, GyroscopeModule.class, LightSensorModule.class, DeviceMotionModule.class, MagnetometerModule.class, MagnetometerUncalibratedModule.class, PedometerModule.class, SMSModule.class, VideoThumbnailsModule.class, WebBrowserModule.class);

        private LazyHolder() {
        }
    }

    public static List<Package> getPackageList() {
        return LazyHolder.packagesList;
    }

    @Override // expo.modules.kotlin.ModulesProvider
    public List<Class<? extends Module>> getModulesList() {
        return LazyHolder.modulesList;
    }
}
