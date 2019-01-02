package tn.esprit.map.services;

import javax.ejb.Stateless;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Message;

@Stateless
public class MailService {

	  @javax.annotation.Resource(name = "java:jboss/mail/RedHat")
	  private Session session;
	 
	  public void send(final String addresses, final String subject,String email_body_title,String email_body_intro_1
			  ,String email_receiver
			  ,String email_body_intro_2
			  ,String email_company_name
			  ,String email_company_slogon
			  ,String company_descrpition
			  ,String email_link) {
	    try {
	      Message message = new MimeMessage(session);
	      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(addresses));
	      message.setSubject(subject);
	      message.setContent(make_cute_email(email_body_title,email_body_intro_1 , email_receiver , email_body_intro_2, email_company_name, email_company_slogon, company_descrpition, email_link), "text/html; charset=utf-8");
	      	System.out.println("send");
	      Transport.send(message);
	    } catch (Exception e) {
	      System.out.println(e);
	    }
	  }
	  
	  
	  public String make_cute_email(String email_body_title,String email_body_intro_1
			  ,String email_receiver
			  ,String email_body_intro_2
			  ,String email_company_name
			  ,String email_company_slogon
			  ,String company_descrpition
			  ,String email_link)
	  {
		  if(email_link.isEmpty())
		  return("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'><html xmlns='http://www.w3.org/1999/xhtml' xmlns:v='urn:schemas-microsoft-com:vml' xmlns:o='urn:schemas-microsoft-com:office:office'><head>  <!--[if gte mso 9]><xml>   <o:OfficeDocumentSettings>    <o:AllowPNG/>    <o:PixelsPerInch>96</o:PixelsPerInch>   </o:OfficeDocumentSettings>  </xml><![endif]-->  <!-- fix outlook zooming on 120 DPI windows devices -->  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>  <meta name='viewport' content='width=device-width, initial-scale=1'> <!-- So that mobile will display zoomed in -->  <meta http-equiv='X-UA-Compatible' content='IE=edge'> <!-- enable media queries for windows phone 8 -->  <meta name='format-detection' content='date=no'> <!-- disable auto date linking in iOS 7-9 -->  <meta name='format-detection' content='telephone=no'> <!-- disable auto telephone linking in iOS 7-9 -->  <title>Single Column</title>  <style>  .header,.title,.subtitle,.footer-text {  font-family: Helvetica, Arial, sans-serif;}h1 profilesmall, h2 profilesmall, h3 profilesmall, h4 profilesmall, h5 profilesmall, h6 profilesmall { font-size: 60%; color: #6f6f6f; line-height: 0; text-transform: none; }.profilebtn {	text-decoration:none;	color: #FFF;	background-color: #666;	padding:10px 16px;	font-weight:bold;	margin-right:10px;	text-align:center;	cursor:pointer;	display: inline-block;}.profilecontent {	padding:15px;	max-width:600px;	margin:0 auto;	display:block; }.header {  font-size: 24px;  font-weight: bold;  padding-bottom: 12px;  color: #DF4726;}.footer-text {  font-size: 12px;  line-height: 16px;  color: #aaaaaa;}.footer-text a {  color: #aaaaaa;}.container {  width: 600px;  max-width: 600px;}.container-padding {  padding-left: 24px;  padding-right: 24px;}.content {  padding-top: 12px;  padding-bottom: 12px;  background-color: #ffffff;}code {  background-color: #eee;  padding: 0 4px;  font-family: Menlo, Courier, monospace;  font-size: 12px;}hr {  border: 0;  border-bottom: 1px solid #cccccc;}.hr {  height: 1px;  border-bottom: 1px solid #cccccc;}.title {  font-size: 18px;  font-weight: 600;  color: #374550;}.subtitle {  font-size: 16px;  font-weight: 600;  color: #2469A0;}.subtitle span {  font-weight: 400;  color: #999999;}.body-text {  font-family: Helvetica, Arial, sans-serif;  font-size: 14px;  line-height: 20px;  text-align: left;  color: #333333;}a[href^='x-apple-data-detectors:'],a[x-apple-data-detectors] {  color: inherit !important;  text-decoration: none !important;  font-size: inherit !important;  font-family: inherit !important;  font-weight: inherit !important;  line-height: inherit !important;}@media only screen and (max-width: 600px) {		a[class='profilebtn'] { display:block!important; margin-bottom:10px!important; background-image:none!important; margin-right:0!important;}}</style><style>body {  margin: 0;  padding: 0;  -ms-text-size-adjust: 100%;  -webkit-text-size-adjust: 100%;}table {  border-spacing: 0;}table td {  border-collapse: collapse;}.ExternalClass {  width: 100%;}.ExternalClass,.ExternalClass p,.ExternalClass span,.ExternalClass font,.ExternalClass td,.ExternalClass div {  line-height: 100%;}.ReadMsgBody {  width: 100%;  background-color: #ebebeb;}table {  mso-table-lspace: 0pt;  mso-table-rspace: 0pt;}img {  -ms-interpolation-mode: bicubic;}.yshortcuts a {  border-bottom: none !important;}@media screen and (max-width: 599px) {  .force-row,  .container {    width: 100% !important;    max-width: 100% !important;  }}@media screen and (max-width: 400px) {  .container-padding {    padding-left: 12px !important;    padding-right: 12px !important;  }}.ios-footer a {  color: #aaaaaa !important;  text-decoration: underline;}</style></head><body style='margin:0; padding:0;' bgcolor='#F0F0F0' leftmargin='0' topmargin='0' marginwidth='0' marginheight='0'>  <!-- 100% background wrapper (grey background) -->  <table border='0' width='100%' height='100%' cellpadding='0' cellspacing='0' bgcolor='#F0F0F0'>    <tr>      <td align='center' valign='top' bgcolor='#F0F0F0' style='background-color: #F0F0F0;'>          <img src='https://preview.ibb.co/hP0KFq/t-l-chargement.png' alt='levio' border='0' style='height:50px'>        <!-- <a href='#'>          </a> -->        <br>        <!-- 600px container (white background) -->        <table border='0' width='600' cellpadding='0' cellspacing='0' class='container'>          <tr>            <td class='container-padding header' align='left'>            </td>          </tr>          <tr>            <td class='container-padding content' align='left'>              <br>              <div class='title'>"+email_body_title+"</div>              <br>              <div class='body-text'>                "+email_body_intro_1+" <a href='#'>"+email_receiver+" </a> "+email_body_intro_2+"              </div>              <div class='profilecontent'><table>                  <tr>                    <!-- <td class='profilesmall' width='20%' style='vertical-align: top; padding-right:10px;'><img src='http://placehold.it/75x75' /></td> -->                    <td>                      <h4 class='title'>"+email_company_name+" <small>"+email_company_slogon+"</small></h4>                      <p class='profile body-text'>"+company_descrpition+". </p>                                          </td>                  </tr>                </table></div>            </td>          </tr>          <tr>            <td class='container-padding footer-text' align='left'>              <!-- <br><br>              Sample Footer text: &copy; 2015 Acme, Inc.              <br><br> --><!--               You are receiving this email because you opted in on our website. Update your <a href='#'>email                preferences</a> or <a href='#'>unsubscribe</a>. -->              <br><br>              <strong>Levio Affaires et Technologies.</strong><br>              <span class='ios-footer'>                  1015, av. Wilfrid-Pelletier, bureau 530<br>                  Québec (Québec) G1W 0C4<br>                  418 914-3623<br>                  <br>                  439, av. University, 5e étage<br>                  Toronto (Ontario) M5G 1Y8<br>                  647 694-9288              </span>              <a href='http://www.acme-inc.com'>www.acme-inc.com</a><br>              <br><br>            </td>          </tr>        </table>        <!--/600px container -->        <a href='#'><img src='https://image.ibb.co/iPuPgV/levio-people.png' alt='levio-people' border='0'></a><br /><a          target='_blank' href='https://poetandpoem.com/Sara-Teasdale/poems'></a><br />      </td>    </tr>  </table>  <!--/100% background wrapper--></body></html>");
		  else 
			  return("<!DOCTYPE html PUBLIC '-//W3C//DTD HTML 4.01 Transitional//EN' 'http://www.w3.org/TR/html4/loose.dtd'><html xmlns='http://www.w3.org/1999/xhtml' xmlns:v='urn:schemas-microsoft-com:vml' xmlns:o='urn:schemas-microsoft-com:office:office'><head>  <!--[if gte mso 9]><xml>   <o:OfficeDocumentSettings>    <o:AllowPNG/>    <o:PixelsPerInch>96</o:PixelsPerInch>   </o:OfficeDocumentSettings>  </xml><![endif]-->  <!-- fix outlook zooming on 120 DPI windows devices -->  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>  <meta name='viewport' content='width=device-width, initial-scale=1'> <!-- So that mobile will display zoomed in -->  <meta http-equiv='X-UA-Compatible' content='IE=edge'> <!-- enable media queries for windows phone 8 -->  <meta name='format-detection' content='date=no'> <!-- disable auto date linking in iOS 7-9 -->  <meta name='format-detection' content='telephone=no'> <!-- disable auto telephone linking in iOS 7-9 -->  <title>Single Column</title>  <style>  .header,.title,.subtitle,.footer-text {  font-family: Helvetica, Arial, sans-serif;}h1 profilesmall, h2 profilesmall, h3 profilesmall, h4 profilesmall, h5 profilesmall, h6 profilesmall { font-size: 60%; color: #6f6f6f; line-height: 0; text-transform: none; }.profilebtn {	text-decoration:none;	color: #FFF;	background-color: #666;	padding:10px 16px;	font-weight:bold;	margin-right:10px;	text-align:center;	cursor:pointer;	display: inline-block;}.profilecontent {	padding:15px;	max-width:600px;	margin:0 auto;	display:block; }.header {  font-size: 24px;  font-weight: bold;  padding-bottom: 12px;  color: #DF4726;}.footer-text {  font-size: 12px;  line-height: 16px;  color: #aaaaaa;}.footer-text a {  color: #aaaaaa;}.container {  width: 600px;  max-width: 600px;}.container-padding {  padding-left: 24px;  padding-right: 24px;}.content {  padding-top: 12px;  padding-bottom: 12px;  background-color: #ffffff;}code {  background-color: #eee;  padding: 0 4px;  font-family: Menlo, Courier, monospace;  font-size: 12px;}hr {  border: 0;  border-bottom: 1px solid #cccccc;}.hr {  height: 1px;  border-bottom: 1px solid #cccccc;}.title {  font-size: 18px;  font-weight: 600;  color: #374550;}.subtitle {  font-size: 16px;  font-weight: 600;  color: #2469A0;}.subtitle span {  font-weight: 400;  color: #999999;}.body-text {  font-family: Helvetica, Arial, sans-serif;  font-size: 14px;  line-height: 20px;  text-align: left;  color: #333333;}a[href^='x-apple-data-detectors:'],a[x-apple-data-detectors] {  color: inherit !important;  text-decoration: none !important;  font-size: inherit !important;  font-family: inherit !important;  font-weight: inherit !important;  line-height: inherit !important;}@media only screen and (max-width: 600px) {		a[class='profilebtn'] { display:block!important; margin-bottom:10px!important; background-image:none!important; margin-right:0!important;}}</style><style>body {  margin: 0;  padding: 0;  -ms-text-size-adjust: 100%;  -webkit-text-size-adjust: 100%;}table {  border-spacing: 0;}table td {  border-collapse: collapse;}.ExternalClass {  width: 100%;}.ExternalClass,.ExternalClass p,.ExternalClass span,.ExternalClass font,.ExternalClass td,.ExternalClass div {  line-height: 100%;}.ReadMsgBody {  width: 100%;  background-color: #ebebeb;}table {  mso-table-lspace: 0pt;  mso-table-rspace: 0pt;}img {  -ms-interpolation-mode: bicubic;}.yshortcuts a {  border-bottom: none !important;}@media screen and (max-width: 599px) {  .force-row,  .container {    width: 100% !important;    max-width: 100% !important;  }}@media screen and (max-width: 400px) {  .container-padding {    padding-left: 12px !important;    padding-right: 12px !important;  }}.ios-footer a {  color: #aaaaaa !important;  text-decoration: underline;}</style></head><body style='margin:0; padding:0;' bgcolor='#F0F0F0' leftmargin='0' topmargin='0' marginwidth='0' marginheight='0'>  <!-- 100% background wrapper (grey background) -->  <table border='0' width='100%' height='100%' cellpadding='0' cellspacing='0' bgcolor='#F0F0F0'>    <tr>      <td align='center' valign='top' bgcolor='#F0F0F0' style='background-color: #F0F0F0;'>          <img src='https://preview.ibb.co/hP0KFq/t-l-chargement.png' alt='levio' border='0' style='height:50px'>        <!-- <a href='#'>          </a> -->        <br>        <!-- 600px container (white background) -->        <table border='0' width='600' cellpadding='0' cellspacing='0' class='container'>          <tr>            <td class='container-padding header' align='left'>            </td>          </tr>          <tr>            <td class='container-padding content' align='left'>              <br>              <div class='title'>"+email_body_title+"</div>              <br>              <div class='body-text'>                "+email_body_intro_1+" <a href='#'>"+email_receiver+" </a> "+email_body_intro_2+"              </div>              <div class='profilecontent'><table>                  <tr>                    <!-- <td class='profilesmall' width='20%' style='vertical-align: top; padding-right:10px;'><img src='http://placehold.it/75x75' /></td> -->                    <td>                      <h4 class='title'>"+email_company_name+" <small>"+email_company_slogon+"</small></h4>                      <p class='profile body-text'>"+company_descrpition+". </p>                      <a class='profilebtn' href='"+email_link+"'>Link &raquo;</a>                    </td>                  </tr>                </table></div>            </td>          </tr>          <tr>            <td class='container-padding footer-text' align='left'>              <!-- <br><br>              Sample Footer text: &copy; 2015 Acme, Inc.              <br><br> --><!--               You are receiving this email because you opted in on our website. Update your <a href='#'>email                preferences</a> or <a href='#'>unsubscribe</a>. -->              <br><br>              <strong>Levio Affaires et Technologies.</strong><br>              <span class='ios-footer'>                  1015, av. Wilfrid-Pelletier, bureau 530<br>                  Québec (Québec) G1W 0C4<br>                  418 914-3623<br>                  <br>                  439, av. University, 5e étage<br>                  Toronto (Ontario) M5G 1Y8<br>                  647 694-9288              </span>              <a href='http://www.acme-inc.com'>www.acme-inc.com</a><br>              <br><br>            </td>          </tr>        </table>        <!--/600px container -->        <a href='#'><img src='https://image.ibb.co/iPuPgV/levio-people.png' alt='levio-people' border='0'></a><br /><a          target='_blank' href='https://poetandpoem.com/Sara-Teasdale/poems'></a><br />      </td>    </tr>  </table>  <!--/100% background wrapper--></body></html>");
	  }


}
