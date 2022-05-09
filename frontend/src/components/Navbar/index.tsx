import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="dsmovie-nav-content">
          <h1>DSMovie</h1>
          <a href="https://github.com/LFC222">
            <div className="dsmovie-contact-conatainer">
              <GithubIcon />
              <p className="dsmovie-contact-link">/devsuperior </p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
