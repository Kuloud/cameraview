package com.noctis.cameraview.frame;

import com.noctis.cameraview.CameraView;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;

/**
 * A FrameProcessor will process {@link Frame}s coming from the camera preview.
 * It must be passed to {@link CameraView#addFrameProcessor(FrameProcessor)}.
 */
public interface FrameProcessor {

    /**
     * Processes the given frame. The frame will hold the correct values only for the
     * duration of this method. When it returns, the frame contents will be replaced.
     *
     * @param frame the new frame
     */
    @WorkerThread
    void process(@NonNull Frame frame);
}
