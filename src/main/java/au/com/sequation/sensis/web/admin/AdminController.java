package au.com.sequation.sensis.web.admin;

/**
 * User: sbegg
 * Date: 25/07/13
 * Time: 11:30 AM
 */

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.mvc.extensions.ajax.AjaxUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.lang.reflect.Constructor;

@Controller
@RequestMapping("/admin")
@SessionAttributes("adminFormBean")
public class AdminController {

    @Inject
    private AdminParametersFactory adminParametersFactory;

    // Invoked on every request

	@ModelAttribute
	public void ajaxAttribute(WebRequest request, Model model) {
		model.addAttribute("ajaxRequest", AjaxUtils.isAjaxRequest(request));
	}

	// Invoked initially to create the "form" attribute
	// Once created the "form" attribute comes from the HTTP session (see @SessionAttributes)

	@ModelAttribute("adminFormBean")
	public AdminFormBean createAdminFormBean() {
//		return new AdminFormBean();
		return adminParametersFactory.getAdminFormBean();
	}

	@RequestMapping(method=RequestMethod.GET)
	public void form() {
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processSubmit(@Valid AdminFormBean adminFormBean, BindingResult result,
								@ModelAttribute("ajaxRequest") boolean ajaxRequest,
								Model model, RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return null;
		}
		// Typically you would save to a db and clear the "form" attribute from the session
		// via SessionStatus.setCompleted(). For the demo we leave it in the session.
		String message = "Form submitted successfully.  Bound " + adminFormBean;
		// Success response handling
		if (ajaxRequest) {
			// prepare model for rendering success message in this request
			model.addAttribute("message", message);
			return null;
		} else {
			// store a success message for rendering on the next request after redirect
			// redirect back to the form to render the success message along with newly bound values
			redirectAttributes.addFlashAttribute("message", message);
			return "redirect:/admin";
		}
	}

}
