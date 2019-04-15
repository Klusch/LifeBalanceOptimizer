package de.kluge.falkensee.LifeBalanceOptimizer.view;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.progressbar.ProgressBar;
import com.vaadin.flow.router.Route;

import de.kluge.falkensee.LifeBalanceOptimizer.presenter.LikePresenter;
import de.kluge.falkensee.LifeBalanceOptimizer.service.LikeService;
import elemental.css.CSSStyleDeclaration.Unit;


/*
 * Das Spring-Framework injiziert diesen Service in den View-Konstruktor,
 * der damit nichts weiter tut als sie an den Konstruktor des Presenters
 * weiterzugeben.
 * 
 * LikeViewVn ist die Vaadin-Implementierung
 */
//@Component
@Route("upload")
public class CustomUploadForm extends VerticalLayout  //extends CustomComponent 
implements LikeView {

	private static final long serialVersionUID = -7703649349582987526L;
	
	@SuppressWarnings("unused")
	private LikePresenter likePresenter;
	private Label likeCountDisplay;
	
	@Autowired	
	public CustomUploadForm(LikeService likeService) {
		likePresenter = new LikePresenter(this, likeService);
		
        final Label infoLabel = new Label();
//        infoLabel.setWidth(240.0f, Unit.PIXELS);
 
        final VerticalLayout dropPane = new VerticalLayout(infoLabel);
//        dropPane.setComponentAlignment(infoLabel, Alignment.MIDDLE_CENTER);
//        dropPane.addStyleName("drop-area");
        dropPane.setSizeUndefined();
 
        ProgressBar progress = new ProgressBar();
        progress.setIndeterminate(true);
        progress.setVisible(false);
        dropPane.addComponent(progress);

        new FileDropTarget<>(dropPane, fileDropEvent -> {
            final int fileSizeLimit = 2 * 1024 * 1024; // 2MB
 
            fileDropEvent.getFiles().forEach(html5File -> {
                final String fileName = html5File.getFileName();
 
                if (html5File.getFileSize() > fileSizeLimit) {
                    Notification.show(
                            "File rejected. Max 2MB files are accepted by Sampler",
                            Notification.Type.WARNING_MESSAGE);
                } else {
                    final ByteArrayOutputStream bas = new ByteArrayOutputStream();
                    final StreamVariable streamVariable = new StreamVariable() {
 
                        @Override
                        public OutputStream getOutputStream() {
                            return bas;
                        }
 
                        @Override
                        public boolean listenProgress() {
                            return false;
                        }
 
                        @Override
                        public void onProgress(
                                final StreamingProgressEvent event) {
                        }
 
                        @Override
                        public void streamingStarted(
                                final StreamingStartEvent event) {
                        }
 
                        @Override
                        public void streamingFinished(
                                final StreamingEndEvent event) {
                            progress.setVisible(false);
                            showFile(fileName, bas);
                        }
 
                        @Override
                        public void streamingFailed(
                                final StreamingErrorEvent event) {
                            progress.setVisible(false);
                        }
 
                        @Override
                        public boolean isInterrupted() {
                            return false;
                        }
                    };
                    html5File.setStreamVariable(streamVariable);
                    progress.setVisible(true);
                }
            });
        });
        
	}

	@Override
	public void displayLikeCount(int likeCount) {
		likeCountDisplay.setText(Integer.toString(likeCount));
	}

	public void o() {
		System.out.println("Ein Schelm");
	}
	
}
