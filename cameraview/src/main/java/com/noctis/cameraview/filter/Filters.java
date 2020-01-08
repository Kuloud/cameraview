package com.noctis.cameraview.filter;

import androidx.annotation.NonNull;

import com.noctis.cameraview.filters.AutoFixFilter;
import com.noctis.cameraview.filters.BlackAndWhiteFilter;
import com.noctis.cameraview.filters.BrightnessFilter;
import com.noctis.cameraview.filters.ContrastFilter;
import com.noctis.cameraview.filters.CrossProcessFilter;
import com.noctis.cameraview.filters.DocumentaryFilter;
import com.noctis.cameraview.filters.DuotoneFilter;
import com.noctis.cameraview.filters.FillLightFilter;
import com.noctis.cameraview.filters.GammaFilter;
import com.noctis.cameraview.filters.GrainFilter;
import com.noctis.cameraview.filters.GrayscaleFilter;
import com.noctis.cameraview.filters.HueFilter;
import com.noctis.cameraview.filters.InvertColorsFilter;
import com.noctis.cameraview.filters.LomoishFilter;
import com.noctis.cameraview.filters.PosterizeFilter;
import com.noctis.cameraview.filters.SaturationFilter;
import com.noctis.cameraview.filters.SepiaFilter;
import com.noctis.cameraview.filters.SharpnessFilter;
import com.noctis.cameraview.filters.TemperatureFilter;
import com.noctis.cameraview.filters.TintFilter;
import com.noctis.cameraview.filters.VignetteFilter;

/**
 * Contains commonly used {@link Filter}s.
 *
 * You can use {@link #newInstance()} to create a new instance and
 * pass it to {@link com.noctis.cameraview.CameraView#setFilter(Filter)}.
 */
public enum Filters {

    /** @see NoFilter */
    NONE(NoFilter.class),

    /** @see AutoFixFilter */
    AUTO_FIX(AutoFixFilter.class),

    /** @see BlackAndWhiteFilter */
    BLACK_AND_WHITE(BlackAndWhiteFilter.class),

    /** @see BrightnessFilter */
    BRIGHTNESS(BrightnessFilter.class),

    /** @see ContrastFilter */
    CONTRAST(ContrastFilter.class),

    /** @see CrossProcessFilter */
    CROSS_PROCESS(CrossProcessFilter.class),

    /** @see DocumentaryFilter */
    DOCUMENTARY(DocumentaryFilter.class),

    /** @see DuotoneFilter */
    DUOTONE(DuotoneFilter.class),

    /** @see FillLightFilter */
    FILL_LIGHT(FillLightFilter.class),

    /** @see GammaFilter */
    GAMMA(GammaFilter.class),

    /** @see GrainFilter */
    GRAIN(GrainFilter.class),

    /** @see GrayscaleFilter */
    GRAYSCALE(GrayscaleFilter.class),

    /** @see HueFilter */
    HUE(HueFilter.class),

    /** @see InvertColorsFilter */
    INVERT_COLORS(InvertColorsFilter.class),

    /** @see LomoishFilter */
    LOMOISH(LomoishFilter.class),

    /** @see PosterizeFilter */
    POSTERIZE(PosterizeFilter.class),

    /** @see SaturationFilter */
    SATURATION(SaturationFilter.class),

    /** @see SepiaFilter */
    SEPIA(SepiaFilter.class),

    /** @see SharpnessFilter */
    SHARPNESS(SharpnessFilter.class),

    /** @see TemperatureFilter */
    TEMPERATURE(TemperatureFilter.class),

    /** @see TintFilter */
    TINT(TintFilter.class),

    /** @see VignetteFilter */
    VIGNETTE(VignetteFilter.class);

    private Class<? extends Filter> filterClass;

    Filters(@NonNull Class<? extends Filter> filterClass) {
        this.filterClass = filterClass;
    }

    /**
     * Returns a new instance of the given filter.
     * @return a new instance
     */
    @NonNull
    public Filter newInstance() {
        try {
            return filterClass.newInstance();
        } catch (IllegalAccessException e) {
            return new NoFilter();
        } catch (InstantiationException e) {
            return new NoFilter();
        }
    }
}
